package java06_class.constructor;


// 잘 사용하지 않으나 이런 방식도 가능함
// 보통 public 클래스로 밖으로 빼놓음
class Constructor{
	
	private int num1 =111; 	// (1)
	private int num2 =222;	//여기 먼저함
	
//	생성자
//	private 로 만들수는 있으나 자주 사용x
//	public 자주 사용
	public Constructor() {
		System.out.println("매개변수없는 생성자");
		System.out.println("디폴트 생성자");
		
		System.out.println("---생성자 초기화 전---");
		System.out.println("num1 : "+getNum1());
		System.out.println("num2 : "+getNum2());

		
//		멤버필드의 값 초기화하기
		System.out.println("---생성자 초기화 후---");
		num1 =555; //(2)
		num2 =666;
	}
	
//	일반 메소드 정의
//	->생성자 만들 때 조심하자!
//	->생성자의 이름과 같은 일반 메소드를 작성한 것이다
//	->생성자는 반환타입이 없다!!
//	public void Constructor() {
//	}
	
//	(모든 멤버필드를 이용한)매개변수있는 생성자 - 오버로딩o
//	대부분 멤버필드를 매개변수로 넣어줌
	public Constructor(int num1, int num2) {
//		this.num1 =num1;
//		this.num2 =num2;
		
		setNum1(num1);
		setNum2(num2);
		System.out.println("num1 : "+getNum1());
		System.out.println("num2 : "+getNum2());
	}
	
	
//	Getter Setter	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
}

public class ConstructorEx {
	
	public static void main(String[] args) {
		
//		객체 변수 선언
		Constructor cons01;
		
//		객체 생성 - 생성자 호출 (매개변수 없는)
		cons01 = new Constructor();
		
		System.out.println("----------------------");
		
//		System.out.println("num1 : "+cons01.getNum1());
//		System.out.println("num2 : "+cons01.getNum2());
		
		
		System.out.println("----------------------");
		
//		객체 생성 - 생성자 호출 (매개변수 있는)
		Constructor cons02 = new Constructor(888,999); 
//		System.out.println("num1 : "+cons02.getNum1());
//		System.out.println("num2 : "+cons02.getNum2());
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
	
}//class
