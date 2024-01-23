package java14_net.test;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {
		

	
	int port = 10000;
	System.out.println("구동");
	ServerSocket server=null;
	Socket client = null;
	try {
		server = new ServerSocket(port);
		
		while(true) {
			
//			Socket clinet = server.accept();
			 client = server.accept();
			
			
		}
		
		
	} catch (IOException e) {
		System.out.println("111");
		e.printStackTrace();
	}
	
	
	
	}
}

