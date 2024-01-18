package java13_io.filterStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex05_2_ObjectInputStream {

	public static void main(String[] args) {
		
//		파일 객체
		File file = new File("./src/java13_io/filterStream/", "ObjectTest.ser");
		
		ObjectInputStream ois = null;
		
		Point[] p = null;
		
		try {
			ois = new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(file)));
			Point p1 = (Point)ois.readObject();
			Point p2 = (Point)ois.readObject();
			Point p3 = (Point)ois.readObject();
//			ArrayList<Point> 
			
			
			
			
			System.out.println(p1.getX()+", "+p1.getY());
			System.out.println(p2.getX()+", "+p2.getY());
			System.out.println(p3.getX()+", "+p3.getY());

			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(ois!=null)	ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
