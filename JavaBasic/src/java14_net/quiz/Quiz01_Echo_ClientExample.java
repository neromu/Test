package java14_net.quiz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Quiz01_Echo_ClientExample {
	public static void main(String[] args) {
		
		try (	Socket sock = new Socket("localhost", 10001); //클라이언트 소켓
				
				PrintWriter out = new PrintWriter( sock.getOutputStream(), true ); //소켓 출력 스트림, autoFlush=true
				BufferedReader in = new BufferedReader( new InputStreamReader( sock.getInputStream() ) ); //소켓 입력 스트림
				
				Scanner sc = new Scanner(System.in) //키보드입력
				) {
			
			System.out.println("+ + + 클라이언트 실행 + + +");
			
			// ----- 데이터 통신 -----
			String msg = null; // 메세지
			
			while(true) {
				
				// 전송할 내용 입력
				System.out.print("\t보낼 메시지 : ");
				msg = sc.nextLine();
				
				// 통신 중단
				if( "/EXIT".equals(msg) )	break;
				
				// 서버로 전송
				out.println(msg);
				
				// ECHO
				System.out.println(">> 받은 메시지 : " + in.readLine() );
				
			}
			
			System.out.println("+ + + 통신 완료 + + +");
			// --------------------
			
		} catch (UnknownHostException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] 알 수 없는 호스트입니다");
			
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println("[ERROR] 소켓 생성 실패, 서버와 통신할 수 없습니다");
			
		}		

	}
}
