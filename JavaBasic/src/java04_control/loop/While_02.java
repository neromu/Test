package java04_control.loop;

public class While_02 {

	public static void main(String[] args) {
		//while 문법
//		초기식; // while구문이 시작되기 전에 작성
		
//		while( 조건식 ) {//while구문의 ()괄호에 작성
			
//			코드작성 부분.
//			조건식이 참(true)일 때 실행할 코드	
//			증감식; //while구문의 {}중괄호 안쪽 제일 마지막으로 작성
//		}
		
		for(int i = 0; i<10; i++) {// i, 0~9, x10
			System.out.println(i);
		}
		System.out.println("----------------------------");
		
		int i=0;//초기식
		while(i<10) {//조건식
			System.out.println(i);
			
			i++;//증감식
		}
//		----------------------------------------------------------
//		for문은 반복횟수가 정해져있거나 정수값으로 반복 진행을 
//		확인할 수 있을 때 주로 사용한다
		
//		while문은 반복 횟수가 명확하지 않거나 정해지지 않았을 때 사용
//		-> 반복을 종료해야하는 조건만 주어졌을 때 사용한다
	}//main

}//class
