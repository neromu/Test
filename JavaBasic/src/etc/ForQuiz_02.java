package etc;

import java.util.Scanner;

public class ForQuiz_02 {

	public static void main(String[] args) {
//		어떤 수의 약수를 구하는 프로그램을 작성하여라
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input Number : ");
		int num = sc.nextInt();
		
		int aliquot;
		for(int i=2;i<1000; i++) {
			if(num%i ==0) {
				System.out.print(i+", ");
			}else {
				
			}
		}

	}//main

}//class
