package java07_inherit;
	
//부모 클래스
class Parent{
	
	String name;
	int age;
	
	public void display() {
		System.out.println("Parent 클래스 메소드");
	}
	
}
//자식 클래스
//	상속 문법 
class Child extends Parent{
	
	int score;
	
	public void print() {
		System.out.println("자식 클래스 메소드");
	}
	
	@Override
	public void display() {
		System.out.println("오버라이딩 메소드");
	}
	
//	오버로딩
	public void display(int num) {
		System.out.println("오버라이딩한 메소드를 오버로딩한 메소드");
	}
	
//	**오버라이딩, Overriding
//	   -메소드 재정의
//	   -상속받은 메소드의 기능을 재정의하는 것
//	   →부모클래스에 정의된 리턴타입, 이름, 매개변수 형식과 같아야 한다.
	
	
}
public class InheritEx_01 {
	public static void main(String[] args) {
//		인스턴스
		Parent p = new Parent();
		
		p.name = "Alice";
		p.age = 123;
		
		p.display();
		
		System.out.println("------------------------");
		
		Child c = new Child();
//		상속받은 필드
		c.name = "Bob";
		c.age = 155;
//		상속받은 메소드	-> Overriding 한 메소드	
		c.display();
		
//		상속받지 않는 필드
		c.score = 789;
		
//		상속받지 않은 메소드
		c.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
