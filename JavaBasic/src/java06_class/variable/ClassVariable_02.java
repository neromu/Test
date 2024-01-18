package java06_class.variable;

public class ClassVariable_02 {
	
//	멤버 필드 -> 인스턴스 변수
	private int num;
	
//	멤버 필드 -> 클래스 변수, static 변수, 정적 변수
	public static String city ="Seoul";

//	** static 정적	실행 전
//	** dynamic 동적	실행 중
	
//	--------------------------------------------
	
//	정적 필드
	private static int data1; //실행 전
	
//	호출 dynamic static 없으면.
//	정적 메소드
	public static void setData1(int data1) { 
//		Setter또한 정적이어야함 
//		this.data1 = data1; 
//		this 자기 자신의 인스턴스를 지칭
		ClassVariable_02.data1 = data1;
		
	
	}
//	정적 메소드
	public static int getData1() {
		return data1;
	}
	
//	--------------------------------------------
//	인스턴스 변수
	private int data2 = 100;
	
//	정적 메소드 
//	->객체 생성없이 곧바로 호출할 수 있도록 준비된다.
	public static void test1() {
//		에러
//		->정적 메소드에서 인스턴스변수를 사용할 수 없다
//		->인스턴스 변수가 만들어지기 전에 실행 준비가 완료되어야 하기 때문
//		data2 = 123;
//		System.out.println(data2);
		
	}
	
//	--------------------------------------------
	
//	이름있는 상수 - 상수화 시킨 변수
//	public final int MAX = 1000; 
//	이 클래스 new 이후 접근가능
//	new 없이 접근 가능
	public static final int MAX = 1000; 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
// 	Getter Setter
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public static String getCity() {
		return city;
	}
	
	public static void setCity(String city) {
		ClassVariable_02.city = city;
	}
}//class
