<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="webInterface.HTMLFooter"%>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" type="text/css" href="../styles/mainstylesheet.css" />
		<link rel="icon" href="../images/favicon.png" type="image/png" />
		<link rel="shortcut icon" href="../favicon.ico" />
		<title>Online jTunes - Main Menu</title>
	</head>
	<body>
		<div class="menu">
			<ul>
				<li>
					<a class="button" href="uploadmp3.jsp" >Upload Music to the Collection</a>
				</li>
				<li>
					<a class="button" href="searchcollection.jsp">Search Music Collection</a>
				</li>
				<li>
					<a class="button" href="" >View Music Collection</a>
				</li>
			</ul>
		</div>
		<div class="group center">
			<table class="mainMenuHeaderTable">
				<tr>
					<td style="padding: 0">
						<a href="mainMenu.jsp">
							<img class="picLink" src="../images/iTunesLogo.PNG" title="Online-iTunes Logo" />
						</a>
					</td>
					<td>
						<h1>Welcome to Online jTunes</h1>
					</td>
					<td width="27%" ></td>
				</tr>
			</table>
			<div class="mainMenuContent">
				<h3>What is Online jTunes?</h3>
				Online jTunes is exactly what it sounds like.<br class="noPad" />
				It is a online music library that you can access from anywhere.<br class="noPad" />
				It allows users to add songs to the online library, sort the songs by many attributes,
				stream the songs straight from the server, and download the songs to the machine they are using currently.
				<br class="nopad" /><br class="nopad" />
				<h3>Getting Started</h3>
				To begin, simply upload some songs to the library.  Then feel free to view, sort, and stream the songs from anywhere.
			</div>
		</div>
		<div style="margin-top: 80px"></div>
		<%= HTMLFooter.getFooter() %>
	</body>
</html>
