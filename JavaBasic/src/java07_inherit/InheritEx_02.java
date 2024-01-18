package java07_inherit;

class Parent2 {
	public int num=1;
	
	public void display() {
		System.out.println("부모 메소드");
	}
	
}//class Parent2

class Child2 extends Parent2{
	
	public String name; //자식클래스의 고유 멤버
	
	public void print() { //자식클래스의 고유 멤버
		System.out.println("자식 고유 메소드");
	}
//	---------------------------------------------
//	상속받은 멤버 필드
	public int num;
	
	@Override
	public void display() {
		System.out.println("오버라이딩 메소드");
		
		System.out.println(num);
		
		System.out.println(super.num);
	}
	
	
	
	
}//class Child2

public class InheritEx_02 {
	public static void main(String[] args) {
		
		Child2 c = new Child2();
		
		System.out.println(c.num);
		
		c.num=123; // 고유멤버 num에 대입 - Child2
		((Parent2)c).num=111; //상속받은 num에 대입 -Parent2
		
//		-------------------------------------------------
		
		Parent2 p = new Parent2();
		
		p.num = 999;
		
//		-------------------------------------------------
		p.display();
		c.display();
		
		System.out.println("----------------------");
		
//		**자바에서는 클래스 타입의 형변환이 금지되어있다
//		**단, 자식클래스를 부모클래스타입으로만 형변환할 수 있다
//		-> 자동형변환된다.
		
//		Parent2 <- Child2 형변환
//		변수선언  | 객체 생성 + 대입
		Parent2 pc = new Child2();
//		static    | dynamic 연산자등
//		
		pc.num = 666;
		
		((Child2)pc).num = 888;
		
		System.out.println("----------------------");
		
//		동적바인딩 - 인스턴스의 타입인 Child2의 display()메소드를 실행한다. 
		pc.display();
		
//		에러, Parent2타입에 print()메소드가 존재하지 않는다
//		->컴파일 타임을 넘기지 못한다
//		->문법 에러
//		pc.print();
		
		((Child2)pc).print();
		
		System.out.println("----------------------");
		
//		**자식클래스를 부모 클래스타입으로 자동 형변환할 수 있다,
//		**부모 타입 객체 변수에 자식 타입 인스턴스를 저장할 수 있다
		
//		**부모 타입 객체를 자식 인스턴스 타입으로 강제 형변환할 수 있다
		
		Parent2 p2 = new Parent2();
		
		
//		예외 발생, 부모 타입을 자식 타입으로 사용할 수 없다
//		((Child2)p2).display();
		
		
//		예외 발생, 부모 타입을 자식 타입으로 형변환할 수 없다
//		Child2 c2 = (Child2)new Parent2();
//		c2.num= 123;
		
//		**ClassCastException 예외
//		->특정 클래스를 다른 클래스로 사용(형변환)하려고 시도할 때 발생한다
//		-> 부모타입을 자식타입으로 사용할 때도 예외가 발생한다
		
//		->실행해보기 전에는 예외 발생 확인할 수 없으므로
//		사전에 조심해야한다
//		(문법 에러는 아님)
		
	}//main
		
}//class InheritEx_02
