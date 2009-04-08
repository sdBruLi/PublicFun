package edu.cs319.connectionmanager.serverside;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;

import edu.cs319.client.IClient;
import edu.cs319.connectionmanager.messaging.Message;
import edu.cs319.connectionmanager.messaging.MessageInputStream;
import edu.cs319.dataobjects.DocumentSubSection;
import edu.cs319.server.CoLabPrivilegeLevel;
import edu.cs319.server.IServer;
import edu.cs319.util.NotYetImplementedException;
import edu.cs319.util.Util;

/**
 * Listens on the server side for changes from the connected clients. Passes events from the network
 * connection on the an implementation of the Server for keeping track of all of the clients.
 * 
 * @author Justin Nelson
 * @author Wayne Rowcliffe
 */
public class ServerDecoder implements Runnable {
	
	private IServer actualServer;
	private Socket socket;
	private MessageInputStream in;
	private OutputStream out;

	public ServerDecoder(IServer actualServer, Socket socket) {
		this.actualServer = actualServer;
		this.socket = socket;
		try {
			this.in = new MessageInputStream(socket.getInputStream());
			this.out = socket.getOutputStream();
		} catch(IOException e) {
			if(Util.DEBUG) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				decodeMessage(in.readMessage());
			} catch (IOException e) {
				if (Util.DEBUG) {
					e.printStackTrace();
				}
				return;
			}
		}
	}

	public void decodeMessage(Message message) throws IOException {
		String cln = message.getSentByClientName();
		List<String> args = message.getArgumentList();
		switch (message.getMessageType()) {
			case NEW_CLIENT:
				IClient toAdd = new ClientEncoder(cln , socket);
				actualServer.addNewClient(toAdd, cln);
				break;
			case NEW_COLAB_ROOM:
				actualServer.addNewCoLabRoom(cln , args.get(0), args.get(1).getBytes());
			case CHANGE_USER_PRIV:
				actualServer.changeUserPrivledge(cln , args.get(0), CoLabPrivilegeLevel.getPrivilegeLevelFromString(args.get(1)));
				break;
			case MEMBER_JOIN_ROOM:
				actualServer.joinCoLabRoom(cln, args.get(0), args.get(1).getBytes());
				break;
			case NEW_MESSAGE:
				actualServer.newChatMessage(cln, args.get(0), args.get(1));
				break;
			case NEW_PRIVATE_MESSAGE:
				actualServer.newChatMessage(cln, args.get(0), args.get(1), args.get(2));
				break;
			case GET_ROOM_LIST:
				actualServer.getAllCoLabRoomNames(cln );
				break;
			case MEMBERS_IN_ROOM:
				actualServer.getClientsCurrentlyInRoom(cln, args.get(0));
				break;
			case NEW_SUBSECTION:
				actualServer.newSubSection(cln, args.get(0), args.get(1), args.get(2), Integer.parseInt(args.get(3)));
				break;
			case REMOVE_SUBSECTION:
				actualServer.subSectionRemoved(cln, args.get(0), args.get(1), args.get(2));
				break;
			case UPDATE_SUBSECTION:
				actualServer.subSectionUpdated(cln, args.get(0), args.get(1), args.get(2), DocumentSubSection.getFromDelimmitedString(args.get(3)));
				break;
			default:
				throw new NotYetImplementedException();
		}
	}
}
