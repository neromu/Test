package kh.test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("문자열을 입력해주세요 : ");
			String str = sc.nextLine();
			if(str.equals("exit")) {
				break;
			}else {
				System.out.println(str.length()+"글자 입니다.");
				// length() : 문자열에 대한 글자 수 반환 메소스
				
			}
			
			
		}
		System.out.println("프로그램을 종료합니다.");
		
		
	}

}
