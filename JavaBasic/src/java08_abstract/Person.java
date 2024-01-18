package java08_abstract;

//	일반화 된 부모 클래스
//	추상 클래스
public abstract class Person {
//	클래스는 new Person 인스턴스 함.
//	인스턴스 <- 메모리에 실체화 하는 것
//	고로 클래스도 미완성인 채로 abstract 되어 있어야함
//	==> new (객체 생성) 불가 클래스가 됨.
	
//	멤버 필드
	protected String name;
	
//	public Person() {}
	public Person(String name) {
		this.name = name;
	}
	
//	가이드 제시
//	public void display() {}
//	구현 x 기능이 없다.
//	추상 메소드
	public abstract void display(); 
//	abstract : 추상화 키워드
//	기능을 주석으로 적어줌
//	ex)데이터 출력해라! etc
	
	
	
	
	
	
}
