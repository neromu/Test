package java14_net.quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Quiz02_FileServer {
	public static void main(String[] args) {
		
		ServerSocket serS = null;
		Socket sock = null;
		
		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0;
		String serv = "localhost";
		final int PORT = 12000;
		
		File file = new File("./src/java14_net/quiz/", "receive.txt");
		BufferedInputStream in = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file);
			serS = new ServerSocket(PORT);
			
			System.out.println("+ + + 서버 소켓 생성 + + +");
			System.out.println("----- 접속 대기중 -----");
			System.out.println("IP : "+InetAddress.getLocalHost().getHostAddress());
			System.out.println("Linsten Port : " + serS.getLocalPort() );
			System.out.println("-----------------------");
			
			sock = serS.accept();
			InetAddress ip = sock.getInetAddress();
			in = new BufferedInputStream( sock.getInputStream() );
			
			System.out.println("\t>>클라이언트 IP : " + ip.getHostAddress()); //IP
			System.out.println("\t>>클라이언트 Port : " + sock.getPort() ); //Port
			
			while (( len = in.read(buf)) != -1) {
				fos.write(buf,0,len);
				fos.flush();
				
				total += len;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			if(in!=null)	in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
			if(fos!=null)	fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(">>복사 완료.");
		System.out.println("total : "+total+"byte");
	}

}
