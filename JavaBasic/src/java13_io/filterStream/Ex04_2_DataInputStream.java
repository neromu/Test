package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04_2_DataInputStream {

	public static void main(String[] args) {
		
//		입력 파일 객체
		File file = new File("./src/java13_io/filterStream/", "DataTest.txt");
		
		DataInputStream dis = null;
		
		
		try {
			dis= new DataInputStream( 
					new BufferedInputStream(
							new FileInputStream(file)));
			
//			순서 boolean int char
//			원본 형식을 무시한 경우 예측하기 힘든 값을 입력받는다.
//			System.out.println(dis.readInt());
			
//			boolean
			boolean bData = dis.readBoolean();
			
//			int
			int iData = dis.readInt();
			
//			char
			char cData = dis.readChar();
			
			System.out.println(bData);
			System.out.println(iData);
			System.out.println(cData);
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(dis!=null) dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
