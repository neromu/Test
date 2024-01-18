package java04_control.loop;

public class DoWhile_02 {

	public static void main(String[] args) {
//		DoWhile 사용 예시
//		->메뉴 화면, 선택
		
//		예시
//		-> ---------메뉴-----------
//		1. 사용자 정보 입력
//		2. 사용자 검색
//		3. 전체 사용자 출력
//		4. 종료
		
//		while로 만들면
//		while(4번을 선택하지 않으면 ) {
//		1. 사용자 정보 입력
//		2. 사용자 검색
//		3. 전체 사용자 출력
//		4. 종료
		
//		메뉴선택 >>_
//		}
		
//		do-while로 만들면
//		do{
//		1. 사용자 정보 입력
//		2. 사용자 검색
//		3. 전체 사용자 출력
//		4. 종료
		
//		메뉴선택 >>_
//		}while( 4번을 선택하지 않으면 );
		
//		위의 코드들을 pseudo code 수도,슈도 코드 라고 함.
//		pseudo <- 직역 : 가품.
		
//		-------------------------------------------------------
		
//		for
		for (int i=0; i<5; i++) {
			System.out.println(i);
		}
		
		System.out.println("----------------------");
//		while
		int i=0;// 초기식
		while(i<5){//조건식
			System.out.println(i);
			
			
			i++;//증감식
		}
		
		System.out.println("----------------------");
//		do-while
		i=0;
//		int i=0;// 초기식
		do {
			System.out.println(i);
			
			
			i++;//증감식
		}while(i<5);//조건식
	}//main

}//class
