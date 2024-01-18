package java13_io.fileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx {

	public static void main(String[] args) {
		
//		Quiz
//		Source.txt 파일의 내용을 읽어들여 Destination.txt 파일로 저장한다
//		-> 파일 복사
		
//		49,520,698 bytes
//		Source.txt ---> FileCopy ----> Destination.txt
//		몇 byte 복사 했습니다
//		-----------------------------------------------------
		
		File fileIn = new File("./src/java13_io/fileStream/", "Source.txt");
		File fileOut = new File("./src/java13_io/fileStream/", "Destination.txt");
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		byte[] buf = new byte[1024];
		int len = -1;
		int total=0;
		
		try {
			fis= new FileInputStream(fileIn);
			fos= new FileOutputStream(fileOut);
			
			while (( len= fis.read(buf)) != -1) {
				
				fos.write(buf,0,len);
				fos.flush();
				
				total += len;
			}
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
			if(fis!=null)	fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
			if(fos!=null)	fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		System.out.println();
		System.out.println("<< 복사 완료 >>");
		System.out.println("Bytes : "+total+"B");
		
		
	}

}
