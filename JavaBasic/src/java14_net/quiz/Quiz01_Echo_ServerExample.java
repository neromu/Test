package java14_net.quiz;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Quiz01_Echo_ServerExample {
	public static void main(String[] args) {
		
		try (	ServerSocket servSock = new ServerSocket(10001);
				) {
			
			System.out.println("+ + + 서버 소켓 생성 + + +");

			System.out.println("----- 접속 대기중 -----");
			System.out.println("Linsten Port : " + servSock.getLocalPort() );
			System.out.println("-----------------------");
			
			// ----- BLOCK -----
			
			while ( true ) {
				
				try (	Socket sock = servSock.accept(); // Listen
						
						BufferedReader in = new BufferedReader( new InputStreamReader( sock.getInputStream() ) ); // 소켓 입력 스트림
						PrintWriter out = new PrintWriter( new BufferedOutputStream( sock.getOutputStream() ), true )	// 소켓 출력 스트림, autoFlush=true
						) {
					
					System.out.println("클라이언트 접속!!");
					
					InetAddress ip = sock.getInetAddress();
					System.out.println("\t>>클라이언트 IP : " + ip.getHostAddress()); //IP
					System.out.println("\t>>클라이언트 Port : " + sock.getPort() ); //Port
					
					// ----- 데이터 통신 -----
					String msg = null;
					
					while( (msg = in.readLine()) != null ) {
						System.out.println(" 받은메시지>> " + msg);
						out.println(msg); // ECHO
					}
					// --------------------
					
					//클라이언트의 정상 종료 : 클라이언트가 .close() 수행
					System.out.println("+ + + 클라이언트가 연결 끊김 (정상) + + +");
					
				} catch (IOException e) {
//				e.printStackTrace();
					
					//클라이언트의 비정상 종료 : 클라이언트 강제 종료
					System.out.println("+ + + 클라이언트 연결 끊김 (비정상) + + +");
				}
				
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
