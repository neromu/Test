package kh.test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
// 직렬화 선언
public class Food implements Serializable {
//	멤버 필드
	private String name;
	private int kcal;
	
//	디폴트 생성자
	public Food() {}
//	매개변수 있는 생성자
	public Food(String name, int kcal) {
	this.name = name;
	this.kcal = kcal;
	}
	
	public void fileSave(String fileName) {
//		- 전달받은 fileName 으로 파일 객체를 생성한다.
		File file = new File(fileName);
		
		int len = -1;
		byte[] buf = new byte[1024];
		
//		객체 스트림 선언
		ObjectOutputStream oos = null;;
		ObjectInputStream ois =null;
		try {			
//			스트림 객체 생성
			 oos = new ObjectOutputStream( new FileOutputStream(file));
			 ois = new ObjectInputStream( new FileInputStream(file));
			
//			읽기 및 쓰기
			while (( len= ois.read(buf)) != -1) {
				oos.write(buf,0,len);
				oos.flush();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
//			출력 스트림 닫기
			try {
			if(oos!=null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
//			입력 스트림 닫기
			try {
			if(ois!=null) ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
//	getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	
//	toSrting()메소드 오버라이딩
	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}
	
	
}
