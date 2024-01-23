package java14_net.quiz;


import java.io.ObjectOutput;
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
		this(fileName,100);
		
		ObjectOutput oos= null;
		
		
		
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
