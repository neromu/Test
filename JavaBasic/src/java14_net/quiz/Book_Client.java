package java14_net.quiz;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Book_Client {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Socket sock = null;
				
		int port = 10000;
		String serv = "localhost";
		int num =0;
//		파일 객체
		List<Book> book = new ArrayList<>();
		
//		객체 스트림
		ObjectOutputStream oos = null;
		ObjectInputStream ois = null;
		OutputStream outNum = null;
		
		
		while(num != 3) {
			try {
				sock= new Socket(serv,port);
				System.out.println("실행 & 접속");
				
//			스트림 객체 생성
				oos = new ObjectOutputStream( new BufferedOutputStream( sock.getOutputStream() ) );
				outNum = sock.getOutputStream();
				
//			Book 객체 생성
				Book scbook = new Book();
				
				System.out.println("-------M E N U -------");
				System.out.println("-------1. 저장--------");
				System.out.println("-------2. 불러오기 ---");
				System.out.println("-------3. 종료 -------");
				System.out.println("----------------------");
				System.out.print("Input >>");
				num = sc.nextInt();
				
				
				outNum.write(num);
				outNum.flush();
				System.out.println();
				
				switch (num) {
				case 1:
					sc.nextLine();
					System.out.print("책의 제목을 적어주세요 : ");
					scbook.setTitle(sc.nextLine());
					System.out.print("책의 저자를 적어주세요 : ");
					scbook.setAuthor(sc.nextLine());
					System.out.print("책의 가격을 적어주세요 : ");
					scbook.setPrice(sc.nextInt());
					
					oos.writeObject(scbook);
					oos.flush();
					break;
					
				case 2:
					ois = new ObjectInputStream( new BufferedInputStream( sock.getInputStream() ) );
					
					List<Book> list = (List)ois.readObject();
					System.out.println("---------책 정보-------");
					System.out.println(list);
					System.out.println("-----------------------");
					System.out.println();
					
					break;
				case 3:
					
					break;
				default:
					System.out.println("[SYSTEM]1~3의 숫자를 입력해 주세요.");
					break;
				}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				if(sock != null)	sock.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}	
		
		
		
	}
}
