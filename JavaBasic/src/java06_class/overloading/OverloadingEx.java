package java06_class.overloading;

public class OverloadingEx {

	public static void main(String[] args) {
//		                 생성자 호출임
		Overloading ol = new Overloading();
//		                 인스턴스
		
		System.out.println("--- display() ---");
		ol.display();
		
//		 44, 55로 출력되도록 조절하기
//		ol.setX(44);	//대입
//		ol.setY(55);	//대입
//		
//		System.out.println("--- afert ---");
//		ol.display();	//출력

		
		
		System.out.println("-----------");
		ol.display();
		ol.display(111, 222);
		System.out.println("--- sum() ---");
		ol.sum();
		
		
	}//main

}//class
