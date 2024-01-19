package java14_net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Net02_BasicServer {
	public static void main(String[] args) {
		System.out.println("서버");
		
//		서버 리슨 소켓
		ServerSocket servSock =null;
		
//		서버 통신 소켓
		Socket sock = null;
		
//		소켓 입력 스트림
		BufferedReader in = null;
		
//		서버 포트 번호 
		final int PORT = 10000;
		
		
		
		try {
			servSock = new ServerSocket(PORT);
			System.out.println("++서버 리슨 소켓 생성++");
			
			System.out.println(">> 서버 IP : "+InetAddress.getLocalHost().getHostAddress());
			System.out.println(">> 서버 Port : "+servSock.getLocalPort());
			System.out.println();
			System.out.println("---- Listening ----");
			sock = servSock.accept();	//리슨, Listen
			
//			클라이언트가 접속하면 Blocked 상태가 풀리면서
//			통신용 Socket 객체를 반환해준다
			
//			**Blocked 
//			다음 코드로 진행되지 않고 일시정지된 상태
			
			System.out.println();
			System.out.println(">> 클라이언트 IP : "+sock.getInetAddress().getHostAddress());
			System.out.println(">> 통신 소켓 Port : "+sock.getPort());
			
//			--- 데이터 통신 ---
//			sock.getInputStream();	//소켓 입력 스트림
//			sock.getOutputStream();	//소켓 출력 스트림
			  
//			소켓 입렷 스트림 생성
			in = new BufferedReader(	//바이트 -> 문자 자동 변환장치가 없음 
					new InputStreamReader(
							sock.getInputStream()));
			String msg = in.readLine();	//Scanner 쓰듯이 쓰는게 가능
//			개행문자 까지만 읽음.
			
			System.out.println();
			System.out.println(">> 전송받은 데이터 : "+msg);
			
			
			
//			1차 ,입력 ,바이트 스트림
//			InputStreamReader
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(in!=null)in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			 try {
				if(sock != null)sock.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			 
			 try {
				if(servSock!=null) servSock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			 
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
