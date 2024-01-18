package java08_abstract;

public class AbstractEX {

	public static void main(String[] args) {
		
		Professor pf = new Professor("Alice","컴퓨터");
		Student st = new Student("Bob", "자바");
		
		pf.display();
		st.display();
		
		System.out.println("---------------------");

//		Person => 자료형, p1 => 참조형
		Person p1;
//		참조형 생성 까지는 에러가 없음.
		
//		에러, Cannot instantiate the type Person
//		인스턴스화 할수 없다.
//		p1 = new Person("Clare");
//		추상클래스를 이용한 객체 생성(new) 불가	
		
		System.out.println("---------------------");
		
//		new(객체 생성)시 클래스의 추상화된 부분을 
//		새로운 클래스 코드로 생성.
//		이름을 붙이지 않아. 익명 클래스라고 함
//		익명 클래스는 Person의 자식 같은 역할을 함
//		일종의 상속.
		Person p2 = new Person("Edward") {
			
			@Override
			public void display() {
				System.out.println("익명 (내부) 클래스");
				System.out.println("Anonymous Inner Class");
			}
		};
		
		p2.display();
		
		System.out.println("---------------------");
		
		Person p3 = new Professor("Clare", "인공지능");
		Person p4 = new Student("Dave", "알고리즘");
		
		p3.display();
		p4.display();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}
