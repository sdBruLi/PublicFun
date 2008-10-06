package id3TagStuff;

import id3TagStuff.frames.ID3v2_2Frame;
import id3TagStuff.frames.ID3v2_XFrame;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import util.Util;

public class ID3v2_XTag {

	private File mp3File;
	private ID3v2_XTagHeader header;
	private List<ID3v2_XFrame> frames;

	public ID3v2_XTag(File mp3FileP) throws IOException {
		mp3File = mp3FileP;
		InputStream in = new FileInputStream(mp3File);
		byte[] headerBytes = new byte[10];
		in.read(headerBytes);
		header = new ID3v2_XTagHeader(Util.castByteArrToIntArr(headerBytes));
		frames = new ArrayList<ID3v2_XFrame>();
		int bytesLeft = header.getSize();
		byte[] frameHeadderBytes = new byte[6];
		while (bytesLeft > 0) {
			in.read(frameHeadderBytes);
			ID3v2_2Frame frame = new ID3v2_2Frame(Util
					.castByteArrToIntArr(frameHeadderBytes), in);
			frames.add(frame);
			bytesLeft -= 6;
			bytesLeft -= frame.getSize();
			System.out.println(bytesLeft);
		}
	}

	@Override
	public String toString() {
		return String.format("File name: %s, Header data: %s", mp3File.getName(), header
				.toString());
	}

	public List<ID3v2_XFrame> getAllFrames() {
		// TODO Auto-generated method stub
		return frames;
	}
}
