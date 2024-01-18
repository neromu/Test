package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03 {

	public static void main(String[] args) {
		
//		Quiz.
		
//		숫자를 여러 개 입력받아 모든 값들의 총합을 구하고
//		최종 합계를 출력하는 프로그램
		
//		->숫자 0을 입력하면 종료
//		-> do-while 구문 활용하기
//		--------------------------------------------------
		Scanner sc = new Scanner(System.in);
		
		int sum,input;
		input=sum =0; 
		do {
			System.out.println("Input Number (종료==0) : ");
			input = sc.nextInt();
			sum += input;
		}while(input != 0);
		
		System.out.println("총 계 : "+sum);
	}//main

}//class
