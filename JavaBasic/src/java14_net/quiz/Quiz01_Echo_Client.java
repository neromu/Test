package java14_net.quiz;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Quiz01_Echo_Client {
	public static void main(String[] args) {
		
//		소켓 생성
		Socket sock = null;
		
//		포트 번호
		final int PORT = 10000;
		final int EXIT = 0;
		
//		IP 주소
		String serverIP ="localhost";
		
//		출력 스트림
		PrintWriter out = null;
		Scanner in = null;
		String msg = null;
		
		InetAddress ip = null;
		
		try {
			sock = new Socket(serverIP, PORT);
			
			out = new PrintWriter(
					new BufferedOutputStream(
					sock.getOutputStream()), true);
			
			
			System.out.print("Input : ");
			out.println(new Scanner(System.in).nextLine() );
			
			
			in = new Scanner(
					new BufferedReader(
							new InputStreamReader(
									sock.getInputStream())));
			
			
			msg = in.nextLine();
			
			System.out.println();
			System.out.println("Server>> " +msg);
			
			while ("EXIT" != msg) {
				
				System.out.print("Input (\"EXIT\" = 종료) : ");
				out.println(new Scanner(System.in).nextLine() );
				
				msg = in.nextLine();
				
				System.out.println();
				System.out.println("Server>> " +msg);
				
				if(msg.equals("EXIT")) {
					out.println("EXIT");
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
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}//main
}
