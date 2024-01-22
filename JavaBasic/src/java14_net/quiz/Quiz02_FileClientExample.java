package java14_net.quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Socket;

public class Quiz02_FileClientExample {
	public static void main(String[] args) {
		
		try (Socket sock = new Socket("localhost", 10002);
//			InputStream is = sock.getInputStream();		//이 경우에 문제가 생긴다
//			OutputStream os = sock.getOutputStream(); 	//
			) {	
			System.out.println("클라이언트 실행 & 접속 ");
			
//			파일 입력
			byte[] buf = new byte[1024];
			int len = -1;
			try (BufferedInputStream in = new BufferedInputStream( 
					new FileInputStream("./src/java14_net/quiz/data.txt") ) ){
//				소켓과 달리 파일은 쓰고난 이후 닫아줌.
				
//				소켓 출력
				BufferedOutputStream out =new BufferedOutputStream(sock.getOutputStream() );
				
				while( ( len = in.read(buf)) != -1)  {
					out.write(buf, 0, len);
					out.flush();
				}
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
			
//			소켓 출력
//			소켓 안에서 동작하는 스트림이므로 소켓까지 닫아버림.
//			==> 소켓의 스트림은 아무때나 닫아서 하면 안된다.
//			OutputStream os = sock.getOutputStream();
//			os.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
