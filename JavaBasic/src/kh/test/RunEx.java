package kh.test;

public class RunEx {
	public static void main(String[] args) {
		Cirecle c = new Cirecle(3.2);	//Cirecle 생성자에는 default 생성자가 없음 -> () 안에 double형의 매개변수를 넣어줘야함
		c.setRadius(3.1);
		c.draw();
		
	}

}
