package etc;

import java.util.Scanner;

public int gcd(int a, int b) {
	if(b == 0) return a;
	else return gcd(b, a%b);
}

public int fibo(int a) {
	if(a == 0 || a == 1) return 1;
	else return fibo(a - 1) * fibo(a - 2);
}

public class ForQuiz_04 {

	public static void main(String[] args) {
//		입력받은 두수의 최소 공배수와 최대 공약수를 구하는
//		프로그램을 작성하라.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력해주세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자를 입력해주세요 : ");
		int num2 = sc.nextInt();
		int a=0,b=0;;
		for(int i=1; i<=num1; i++) {
			
			if(num1%i==0) {
				
				if(num2%i==0) {
					a = i;
				}
			
			}
		
		}
		
		
		for(int i=num1; i<=(num1*num2); i++) {
			
			if(i%num1==0) {
				if(i%num2==0 && b==0) {
					b=i;
				}
			}
			
		}
		
		System.out.println("최대공약수 : "+a);
		System.out.println("최소공배수 : "+b);
		
	}//main

}//class
