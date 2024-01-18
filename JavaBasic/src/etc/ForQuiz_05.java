package etc;

import java.util.Scanner;

public class ForQuiz_05 {

	public static void main(String[] args) {
//		1에서부터 입력된 어떤 수까지 내에 있는 소수를
//		찾는 프로그램을 작성하라.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input : ");
		int num = sc.nextInt();
		int a=0;
		for(int i=1;i<=num;i++) {
			
			for(int j=1;j<i;j++) {
				
				if(i%j==0) {
					a++;
				}else if(a<2 && j>(i-2)) {
					System.out.println(i);
				}
				
			}
			a=0;
		}

	}//main

}//class
