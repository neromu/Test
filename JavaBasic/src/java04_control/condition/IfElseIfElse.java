package java04_control.condition;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// if ~ else if ~ else
		
//		if( 조건식1 ) {
//			//조건식1 이 참일 때 수행하는 영역
//		
//		}else if( 조건식2 ){
//			//조건식1 이 거짓이고, 조건식2 가 참일 때
//			
//		}else if ( 조건식3 ) {
//			//조건식1 거짓+ 조건식2 거짓+ 조건식3 참
//			
//		}else {
//			//조건식1 거짓+ 조건식2 거짓+ 조건식3 거짓
//			
//		}
//		else if구문은 작성할 수 있는 개수에 제한이 없다
//		else if, else 구문은 필수가 아니다
		
//		if문 없이 단독으로 else if, else만 사용할 수는 없다
		
//		else만 사용하는 제어문은 if문 전체에서 마지막에 1개만 올 수 있다
//		-------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input Number : ");
		int num = sc.nextInt();
		
		if(num == 10) {
			System.out.println("10입니다");
		}else if(num==20) {
			System.out.println("20입니다");
		}else if(num==30) {
			System.out.println("30입니다");			
		}else {
			System.out.println("10, 20, 30 모두 아닙니다");
		}
		System.out.println("---------프로그램 종료-------");
		
		
		
		
		
	}//main

}//class
