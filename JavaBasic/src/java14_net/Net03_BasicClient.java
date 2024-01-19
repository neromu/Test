package java14_net;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Net03_BasicClient {
	public static void main(String[] args) {
		System.out.println("클라이언트");
		
//		클라이언트 접속, 통신용 소켓
		Socket sock = null;
		
//		소켓 출력 스트림
		PrintWriter out =null;
		
//		접속할 서버의 IP, Port 변수
		String serverIP = "localhost";
		int port = 10000;
		
		
//		InetAdress 타입으로 서버 지정하기
		InetAddress ip = null;
//		소켓객체를 생성하며 서버로 접속한다
//		sock = new Socket("서버IP 또는 호스트", 서버포트번호);
		
		
		try {
//			sock = new Socket(serverIP,port);
//			sock = new Socket("192.168.10.12",port);
			sock = new Socket("192.168.10.11",port);
			
			
//			--- 데이터 통신 ---
//			new BufferedWriter( 문자 스트림)
//			new BufferedOutputStream( 바이트 스트림)
			
//			new PrintWriter(
//				new BufferedWriter(	//성능향상(문자)
//					new OutputStreamWriter(	//바이트 -> 문자
//							sock.getOutputStream())));	//소켓 출력 (바이트)
			
			out = new PrintWriter(	//바이트 -> 문자 변환장치가 있음
					new BufferedOutputStream(	
									sock.getOutputStream()),  true);	//auto flush
			
//			out.println("Hello");
//			out.println("Hello");
//			out.flush();	//autoFlush로 생략됨.
			
			System.out.print(">> Input : ");
			out.println(new Scanner(System.in).nextLine());
			
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			if(out != null) out.close();	//PrintWriter는 close 시에도 자동으로 try catch함.

			try {
				
			if(sock !=null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		}
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
