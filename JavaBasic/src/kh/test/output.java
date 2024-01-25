package kh.test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class output {

	public static void main(String[] args) {
		
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("./test.txt",true);
			fw.write(97);
			fw.write(65);
			fw.flush();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
			if(fw!=null) 	fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
	}

}
