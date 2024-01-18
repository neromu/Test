package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyExample2 {

	public static void main(String[] args) {
		
		File fileIn = new File("./src/java13_io/fileStream/", "Source.txt");
//		System.out.println(file.exists()); //exists 확인 => true 
		File fileOut = new File("./src/java13_io/fileStream/", "Destination.txt");
//		System.out.println(fileOut.exists()); //exists 확인 => false 
		
		byte[] buf = new byte[1024];
		int len = -1;
		int total = 0;
		
//		데이터 저장소		
		StringBuilder sb =new StringBuilder();
		
//		입출력 스트림 try~catch
		try (	FileInputStream fis = new FileInputStream(fileIn);
				FileOutputStream fos= new FileOutputStream(fileOut) ){
			
			
			while( fis.read(buf, 0, len) != -1) {
				fos.write(buf,0,len);
				fos.flush();
				total += len;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		System.out.println();
		System.out.println("<< 복사 완료 >>");
		System.out.println("Bytes : "+total+"B");
		
		
	}

}
