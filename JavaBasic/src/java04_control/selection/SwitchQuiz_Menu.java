package java04_control.selection;

import java.util.Scanner;

public class SwitchQuiz_Menu {

	public static void main(String[] args) {
		
//   - 메뉴 만들기
//
//   ===============================
//		      M  e  n  u
//   ===============================
//		      1. Hello World 출력
//		      2. 이름 출력
//		      3. 성별 출력
//		      4. 종료
//   ===============================
//
//		     >> _
//
//		    -> 각 메뉴 번호를 입력하면 메뉴에 알맞게 동작하도록 작성
//		    -> 동작은 간단한 출력으로 해결
//		------------------------------------------------------
		
//		메뉴 번호 상수
		final int HELLO_MENU =1;
		final int NAME_MENU =2;
		final int GENDER_MENU =3;
		final int EXIT_MENU =4;
//		------------------------------------------------------
//		상수 적용시 가독성이 좋아짐
		
		Scanner sc = new Scanner(System.in);
		
		int input;
		do {	
			System.out.println("==========================");
			System.out.println("\tM   e   n  u");
			System.out.println("==========================");
			System.out.println("\t1. Hello World 출력");
			System.out.println("\t2. 이름 출력");
			System.out.println("\t3. 성별 출력");
			System.out.println("\t4. 종료");
			System.out.println("==========================");
			System.out.print("\t>> ");
			input = sc.nextInt();
			switch (input) {
			case EXIT_MENU:
				System.out.println("\t>>종료합니다.");
				break;
			case GENDER_MENU:
				System.out.println("\t>>Male");
				break;
			case NAME_MENU:
				System.out.println("\t>>Bob");
				break;
			case HELLO_MENU:
				System.out.println("\t>>Hello World");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}while(input!=4);
	}//main

}//class
