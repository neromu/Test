package java04_control.condition;

public class IfElse_03 {
	
	public static void main(String[] args) {
		int num = 33;
		
		if( num>0 && num<=100) {
			System.out.println("num 은 1~100사이의 정수");
		}else {
			System.out.println("num 은 1~100사이의 정수가 아닙니다");
		}
		System.out.println("----------------------------------");
		if(num>0) {
				
			if(num<=100) {
				System.out.println("num 은 100보다 작거나 같다");				
			}//ifif
			System.out.println("num 은 0보다 크다");
			
		}else {
			System.out.println("num 은 0보다 작거나 같다");	
			if(num==0) { 
				System.out.println("0과 같다");					
			}else {
				System.out.println("0보다 작다");									
			}
		
		}
		
		
		
	}//main
}//class
