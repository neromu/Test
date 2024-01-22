package java14_net.quiz;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class Quiz02_FileClient {
	public static void main(String[] args) {
		
		Socket sock = null;
		
		final int PORT = 12000;
		String serverIP = "localhost";
		int len = -1;
		byte[] buf = new byte[1024];
		int total = 0;
		
		File file = new File("./src/java14_net/quiz/", "data.txt");
		BufferedOutputStream out = null;
		FileInputStream fis = null;
		
		try {
			sock = new Socket(serverIP,PORT);
			fis = new FileInputStream(file);
			out = new BufferedOutputStream( sock.getOutputStream()); 
			
			while (( len= fis.read(buf)) != -1) {
				out.write(buf,0,len);
				out.flush();
				total += len;
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			if(out!=null)	out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
			if(sock!=null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} 
		System.out.println(">>파일 전송 완료.");
		System.out.println("byte : " + total +"byte");
	}

}
