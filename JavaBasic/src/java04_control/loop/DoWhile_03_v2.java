package java04_control.loop;

import java.util.Scanner;

public class DoWhile_03_v2 {

	public static void main(String[] args) {
//		do-while문 while문으로 변경.
		Scanner sc = new Scanner(System.in);
		
		int sum,input;
		sum =0; 
		while(true){
			System.out.println("Input Number (종료==0) : ");
			input = sc.nextInt();
			sum += input;
//			0입력하면 반복문 종료
			if( input == 0 ) {
//				반복문 중단
				break;
			}//if	
		}//while
		
		System.out.println("총 계 : "+sum);
		

	}//main

}//class
