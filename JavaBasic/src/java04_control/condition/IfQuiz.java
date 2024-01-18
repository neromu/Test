package java04_control.condition;

import java.util.Scanner;

public class IfQuiz {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// 숫자 하나를 입력받아 양수인지 음수인지 판별하기
		// -> Input Number : -3
		// -> 음수입니다
		
		// 입력한 데이터가 3의 배수인지 판별하기 (%연산자 사용)
		// -> Input Number : 7
		// -> 3의 배수가 아닙니다
		
		// 두 수를 입력 받아 큰 수를 출력하시오
		// -> Input Number1 : 44
		// -> Input Number2 : 88
		// -> 88이 더 큰 수
		
		//---------------------------------------------------------------------
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int input1 = sc.nextInt();
		
		if(input1 > 0) {
			System.out.println("양수입니다");
		}
		
		if(input1 < 0) {
			System.out.println("음수입니다");
		}
		
		if(input1 == 0) {
			System.out.println("0 입니다");
		}
		
		System.out.println("--------------------------------------------------------");
		
		System.out.print("Input Number : ");
		int input2 = sc.nextInt();
		
		if(input2%3 == 0) {
			System.out.println("[" + input2 + "] 3의배수 입니다");
		}
		
		if(input2%3 != 0) {
			System.out.println("[" + input2 + "] 3의배수가 아닙니다");
		}
		
		System.out.println("--------------------------------------------------------");
		
		System.out.print("Input Number1 : ");
		int input3 = sc.nextInt();
		System.out.print("Input Number2 : ");
		int input4 = sc.nextInt();
		
		if(input3 > input4) {
			System.out.println(input3 + "이 더 큰 수");
		}
		
		if(input3 < input4) {
			System.out.println(input4 + "이 더 큰 수");
		}
		
		if(input3 == input4) {
			System.out.println("두 수가 같습니다");
		}
		
	}

}