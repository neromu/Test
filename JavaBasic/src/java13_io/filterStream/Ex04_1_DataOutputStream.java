package java13_io.filterStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_1_DataOutputStream {

	public static void main(String[] args) {
		
//		출력 파일 객체
		File file = new File("./src/java13_io/filterStream/", "DataTest.txt");
		
//		데이터 출력 스트리
		DataOutputStream dos =null;
		
		
		try {
			//순서는 때에 따라 달라짐
//			Program -> DataOutputStream -> BufferedOutputStream -> System.out -> Console
//현재순서	Program -> DataOutputStream -> BufferedOutputStream -> FileOutputStream -> File
			dos = new DataOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(file)));
			
//			OutputStream의 기본 출력 메소드
//			-> 1B 단위로 ASCII 코드를 처리한다
//			dos.write(65);	// 'A'
//			dos.write("Apple".getBytes());	//"Apple"
			
//			DataOutputStream의 자료형 유지 출력 메소드
			dos.writeBoolean(false);	//1B
//			false 원본 데이터 => 0 --> 문자타입으로 보여주면 \n == null			
//			
//			dos.writeInt(2063597568);	//4B
			dos.writeInt(123);	//4B
//			int 4B == 32bit
			dos.writeChar('가');	//2B
			
//			출력 버퍼 비우기
			dos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
//				출력 dos 스트림 닫기
				if(dos!=null) dos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
