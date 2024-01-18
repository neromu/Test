package etc;

import java.util.Scanner;

public class Etc_02 {

	public static void main(String[] args) {
//		구구단 중 입력받은 수의 단수를 출력하여라
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("단 수를 입력해주세요 : ");
//		int input = sc.nextInt();
//		int i;
//		for(i=1;i<=9;i++) {
//			System.out.println(input+"x"+i+"="+(input*i));
//			
//		}
//		---------------------------------------------
//		어떤 수의 약수를 구하는 프로그램을 작성하여라
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Input Number : ");
//		int num = sc.nextInt();
//		
//		int aliquot;
//		for(int i=2;i<1000; i++) {
//			if(num%i ==0) {
//				System.out.print(i+", ");
//			}else {
//				
//			}
//		}
//		---------------------------------------------
//		1에서 1000까지의 정수중에서 4로 나누어도
//		6으로 나누어도 나머지가 1인 수의 합을 출력하라.
		
//		int sum=0;
//				
//		for(int i=1; i<1000; i++) {
//			if(i%4==1) {
//				if(i%6==1) {
//						sum += i;
//				}
//			}
//			
//		}
//		System.out.println(sum);
//		---------------------------------------------
//		입력받은 두수의 최소 공배수와 최대 공약수를 구하는
//		프로그램을 작성하라.
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫번째 숫자를 입력해주세요 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두번째 숫자를 입력해주세요 : ");
//		int num2 = sc.nextInt();
//		int a=0,b=0;;
//		for(int i=1; i<=num1; i++) {
//			
//			if(num1%i==0) {
//				
//				if(num2%i==0) {
//					a = i;
//				}
//			}
//		}
//		for(int i=num1; i<=(num1*num2); i++) {
//			
//			if(i%num1==0) {
//				if(i%num2==0 && b==0) {
//					b=i;
//				}
//			}
//		}
//		System.out.println("최대공약수 : "+a);
//		System.out.println("최소공배수 : "+b);
		
//		---------------------------------------------
//		1에서부터 입력된 어떤 수까지 내에 있는 소수를
//		찾는 프로그램을 작성하라.
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Input : ");
//		int num = sc.nextInt();
//		int a=0;
//		for(int i=1;i<=num;i++) {
//			
//			for(int j=1;j<i;j++) {
//				
//				if(i%j==0) {
//					a++;
//				}else if(a<2 && j>(i-2)) {
//					System.out.println(i);
//				}
//				
//			}
//			a=0;
//		}
//		---------------------------------------------
		
	}//main

}//class
