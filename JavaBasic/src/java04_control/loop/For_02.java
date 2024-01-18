package java04_control.loop;

public class For_02 {

	public static void main(String[] args) {
//		int i;
		//i변수가 0부터 10보다 작은 동안에 1씩 증가하면서 반복
//		for( i=0; i<10; i++) {
//			System.out.println(i);
			
//		}
//		**for문의  초기식에서 변수를 선언하고 사용하면 
//		for문 종료 이후에 접근할 수 없다
//		-> for문의 {}중괄호에서만 사용하고 끝나면 변수가 지워진다
		
//		System.out.println("for 이후 : "+i);
		int i;
		for(i=0; i<13; i++) {
			System.out.println(i);
		}
		
//		i변수가 0부터 13보다 작은 동안 1씩 증가하면서 반복한다
//		sysot i
		
//		반복횟수 : 13번
//		반복구간 : 0~12
//		----------------------------------------------------------
		for(i=6;i<11; i++) {
			
		}
//		i변수가 6부터 11보다 작은 동안 1씩 증가
		
//		반복횟수 : x5 
//		반복구간 : 6~10
		System.out.println("----------------------");
		for(int num=10; num>=1; num--) {
			System.out.println(num);
		}
		
//		num 변수가 10부터 1과 같거나 클 동안 1씩 감소하면서 반복
		
//		반복횟수 : x10
//		반복구간 : 10~1
		System.out.println("------------------------");
		
//		-----------------------------------------------
		
		for(int j=0;i<10; i+=2) {
			System.out.println(j);
		}
		
//		j변수가 0부터 10보다 작은 동안 2씩 증가
		
//		반복횟수 : 5
//		반복구간 : 0,2,4,6,8

	}

}
