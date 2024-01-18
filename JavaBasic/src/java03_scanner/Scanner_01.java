package java03_scanner;

import java.util.Scanner;

//import java01_variables.Variables_01;

// import 선언코드
// -> 현재 소스코드에서 java.util.Scanner 클래스의 이름을 패키지를 생략한 Scanner로 사용하겠다는 선언

public class Scanner_01 {

	@SuppressWarnings({ "unused" })
	public static void main(String[] args) {

		// class Scanner
		// 스캐너 클래스
		
		// 키보드로 입력한 내용을 프로그램 데이터로 가져오는 기능 클래스
		
		// 입력 기능 클래스
		
		//--------------------------------------------------------------------------
		
		// 기본형 변수
		int num; // int형 변수 선언
		num = 123; // int 값 대입
		
		//--------------------------------------------------------------------------
		
		// 참조형 변수
		java.util.Scanner input;
		
		Scanner in;
		
		// Organize Imports (import 정리) : ctrl + shift + o
		
		//--------------------------------------------------------------------------
		
		//참조형 변수 선언
		Scanner sc;
		
		// 객체 생성
		sc = new Scanner(System.in);
		
		// new Scanner() : 입력 기능 생성(활성화)
		// System.in : 키보드
		
//		System.out.println(sc);
		
//		Variables_01 v01 = new Variables_01();
//		System.out.println(v01);
		
		//--------------------------------------------------------------------------

//		sc.nextInt();
//		sc.nextLong();

		System.out.print("숫자를 입력하세요 : ");
		int data = sc.nextInt();
		
		// sc : 키보드 입력 기능 개체
		// nextInt() : 정수값 추출하여 프로그램으로 가져오는 기능
		
		System.out.println("입력된 값 : " + data);
		
		System.out.println("----------------------------------------");
		
		System.out.print("실수값 입력 : ");
		System.out.println("입력한 실수 : " + sc.nextDouble());
		
		// 자원 해제 (반납)
		// -> 프로그램에 연결해서 사용하던 자원(키보드)의 사용 종료
		sc.close();
		
	} // main end

}