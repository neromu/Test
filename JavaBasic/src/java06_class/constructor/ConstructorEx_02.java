package java06_class.constructor;

//	Constructor 사용시 에러, default 클래스 ConstructorEx 에 존재
class Constructor_02{
	
//	멤버 필드
	private int n1;
	private int n2;
	
//	----------------------------------------------------------
	
//	this 키워드
//	->자기 참조 객체
//	->클래스 코드에서 멤버필드나 멤버메소드를 지칭할 때 사용한다
	
//	->같은 클래스의 다른 멤버를 참조할 수 있게된다
	
//	----------------------------------------------------------

//	this() 생성자 호출
//	->같은 클래스의 다른 생성자를 호출하는 코드
//	->반드시 생성자의 첫 번째 코드로 작성되어야 한다
	
//	----------------------------------------------------------
	
//	모든 멤버필드를 초기화하는 매개변수 있는 생성자
//	-> 단축키 : alt + shift + s , o , enter
	public Constructor_02(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2; 
	}
//	생성자 오버로딩
	public Constructor_02(int n1) {
		this(n1,0);  //맨 처음에 써야함 - 생성자 호출
//		this.n1 =n1;
//		this.n2 = 0; // 안 써도 0
	}
//	디폴트 생성자
	public Constructor_02() { //{} 비워두는 경우가 많음
		this(0,0);
//		n1=0;
//		n2=0;
	}	
		
//	모든 멤버필드의 값을 출력하는 일반 메소드
	public void out() {
		System.out.println("n1 : "+n1+", n2: " +n2);
	}
	
//	Getter Setter
	public int getN1() {
		return n1;
	}
	
	public void setN1(int n1) {
		this.n1 = n1;
	}
	
	public int getN2() {
		return n2;
	}
	
	public void setN2(int n2) {
		this.n2 = n2;
	}
}

//------------------------------------------------------------------
public class ConstructorEx_02 {

	public static void main(String[] args) {
//		생성자가 존재 하기 때문에
//		JVM에서 default 타입 생성자 안 만들어줌
		Constructor_02 cons01 = new Constructor_02(111, 222);
		cons01.out();
		
		System.out.println("----------------------");
		
		Constructor_02 cons02 = new Constructor_02(333);
		cons02.out();
		
		System.out.println("----------------------");
		Constructor_02 cons03 = new Constructor_02();
		cons03.out();
		
	}//main

}//class
