package java14_net.quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Quiz01_Echo_Server {
	public static void main(String[] args) {
		
//		서버 리슨 소켓
		ServerSocket servSock = null;
		
//		통신 소켓
		Socket sock = null;
		
//		소켓 입력 스트림
//		BufferedReader in = null;
		Scanner in = null;
		
//		포트 번호
		final int PORT = 10000;
		final int EXIT = 0;
		
		PrintWriter out = null;
		String msg = null;
		
		
		
		try {
			servSock = new ServerSocket(PORT);
			System.out.println("리슨 소켓 생성");
			
			System.out.println("IP : "+InetAddress.getLocalHost().getHostAddress());
			System.out.println("Port : "+servSock.getLocalPort());
			System.out.println();
			
			System.out.println("---리슨---");
//			리슨 실행..
			sock= servSock.accept();
			
			in = new Scanner(
					new BufferedReader(
							new InputStreamReader(
									sock.getInputStream())));
			
//			String msg = in.readLine();
			msg = in.nextLine();
			
			System.out.println();
			System.out.println("Client>> " +msg);
			
			
		out=new PrintWriter(
					new BufferedOutputStream(
							sock.getOutputStream()),true);
			
		System.out.println("[SYSTEM] SERVER -> CLIENT ");
		
		out.println(msg);
//		out.flush();	
		
		while ( "EXIT" != msg) {
			msg = in.nextLine();
			System.out.println();
			System.out.println("Client>> " +msg);
			
			System.out.println("[SYSTEM] SERVER -> CLIENT ");
			out.println(msg);
			
			if(msg.equals("EXIT")) {
				System.out.println("[SYSTEM]>>연결을 종료합니다.");
				break;
			}
			
		}
		
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(sock!=null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if(servSock!= null)	servSock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
