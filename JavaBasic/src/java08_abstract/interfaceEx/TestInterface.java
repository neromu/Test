package java08_abstract.interfaceEx;

public interface TestInterface {
//public class TestInterface {
//	interface = > 클래스를 기반으로 작성된 문법
//	class로 변경하고 싶으면 interface 를 class로 변경하면됨
	
	
	
//	인터페이스, interface
//	상수 멤버 필드
//	추상 멤버 메소드
	
//	------------------------------------------------
	
//	상수 멤버 필드
//	-> public static final 키워드가 붙은 필드만 선언 가능하다
	public static final int NUM1 = 123;
//	**선언과 동시에 초기화 필수
	
//	--------------------------------------------------
	
	
//	**public static final 키워드를 생략해도 모든 키워드를
//	  자동으로 붙여서 선언된다
	
//	**인터페이스에 필드를 선언할 때 public static final 키워드를
//	  모두 붙여서 작성하는 것이 좋다
	int NUM2 = 234;
	public int NUM3 = 345;
	static int NUM4 = 456;
	public final int NUM5 = 567;
//	--------------------------------------------------
	
//	에러, abstract키워드 없이도 추상메소드로 적용된다
//	-> 추상메소드는 {}중괄호가 없어야한다
	public void out();
	
//	쓰는게 좋다.
	public abstract void display();
	
}
