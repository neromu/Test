package etc;

import java.util.Scanner;

public class ForQuiz_01 {
	
	public static void main(String[] args) {
//		구구단 중 입력받은 수의 단수를 출력하여라
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수를 입력해주세요 : ");
		int input = sc.nextInt();
		int i;
		for(i=1;i<=9;i++) {
			System.out.println(input+"x"+i+"="+(input*i));
			
		}
		
		
	}//main

}//class
