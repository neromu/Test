package java06_class.methodquiz;

public class MethodQuiz {
	
	
//	Q1. 1~100출력 기능
	public void print100() {
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
	};

//	Q2. 전달인자만큼 "Hello"반복 출력
	public void printHello(int count) {
		for(int i=0; i<count; i++) {
			System.out.println("Hello");
		}
	};
	
//	Q3. 전달인자 숫자만큼 전딜인자 문자열을 반복 출력
	public void printData(int count,String data) {
		for(int i=0; i<count; i++) {
			System.out.println(data);
		}		
	};
	
}//class
