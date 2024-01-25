package kh.test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_1 {
	public static void main(String[] args) {
		

	
	int port = 10000;
	System.out.println("구동");
	ServerSocket server=null;
	Socket client = null;
	try {
		server = new ServerSocket(port);
		System.out.println("연결전");
		client = server.accept();
		System.out.println("연결완");
//		while(true) {
			
//			Socket clinet = server.accept();
			
			
//		}
		
		
	} catch (IOException e) {
		System.out.println("111");
		e.printStackTrace();
	}
	
	
	
	}
}
