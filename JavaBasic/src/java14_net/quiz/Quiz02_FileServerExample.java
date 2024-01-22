package java14_net.quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Quiz02_FileServerExample {
	public static void main(String[] args) {
		
		try(ServerSocket servSock = new ServerSocket(10002);) {
			
			System.out.println("---접속 대기중 ---");
			System.out.println(" Listen Port : "+servSock.getLocalPort());
			System.out.println("------------------");
			
			try (Socket sock = servSock.accept(); ) {
				
				System.out.println();
				System.out.println("클라이언트 접속!!");
				
//				소켓 입력
				BufferedInputStream in = new BufferedInputStream( sock.getInputStream() );
				
//				파일 출력
				byte[] buf = new byte[1024];
				int len = -1;
				try( BufferedOutputStream out = new BufferedOutputStream( new FileOutputStream("./src/java14_net/quiz/receiveExample.txt"));
						){
					
					while( ( len = in.read(buf)) != -1)  {
						out.write(buf, 0, len);
						out.flush();
					}
					
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				}
				
//				수동으로 추가 해줘야함.
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
