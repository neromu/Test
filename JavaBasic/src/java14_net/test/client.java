package java14_net.test;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class client {

	public void clinet() {
		Socket socket = null;
		int port = 10000;
		String serverIP ="localhost";
		try {
//			serverIP = InetAddress.getLocalHost().getHostAddress();
			System.out.println("클라이언트");
//			Socket socket = new Socket(serverIP,port);
			 socket = new Socket(serverIP,port);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
