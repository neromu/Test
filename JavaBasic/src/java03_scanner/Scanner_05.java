package java03_scanner;

import java.util.Scanner;

public class Scanner_05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// 입력 객체
		Scanner sc = new Scanner(System.in);
				
		System.out.println("--- 입력 ---");
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
//		double num = sc.nextDouble();
//		boolean num = sc.nextBoolean();
//		String num = sc.next();
//		String num = sc.nextLine();              // nextLine()을 제외한 모든 메소드 문제 있음
		
		System.out.print("Input String : ");
		
		// 입력 버퍼 비우기, 버퍼에 남은 '\n'을 제거   // nextLine()은 \n을 찾고 가져옴
		sc.nextLine();
		
//		sc.skip("[\\r\\n]+");                    // 정규식   // 입력 버퍼의 '\r', '\n'을 모두 제거
		String str = sc.nextLine();
		
		System.out.println();
		System.out.println("--- 출력 ---");
		System.out.println("숫자 : " + num);
		System.out.print("문자열 : " + str);
		
		// nextLine()을 먼저 쓰고 nextInt()를 쓰면 위에 처럼 nextLine()을 추가할 필요가 없음  // 그대로 쓰면 정상 작동
		
	}

}