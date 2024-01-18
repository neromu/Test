package java04_control.loop;

public class For_07 {

	public static void main(String[] args) {
		
//		   Quiz.
//	   첫날에 10원을 예금하고,
//	   다음날에는 전날의 2배를
//	   예금하는 방식으로
//	   보름(15일) 동안 저축한 금액은?
//	      -> 327670
//		int tommorow=0;
//		int today =10;
//		int amount=0;
//		for(int i=0;i<15;i++) {
//			if(amount == 0) {
//				amount += today;
//				tommorow = today*2;
//			}else{
//				amount = amount + tommorow;
//				today = tommorow;
//				tommorow= today*2;
//			}
//		}
////		총 금액
//		System.out.println(amount);
		
//		   Quiz.
//	   첫날에 10원을 예금하고,
//	   다음날에는 전날의 2배를
//	   예금하는 방식으로
//	   보름(15일) 동안 저축한 금액은?
//	      -> 327670
		int deposit=10,amount=0;
		int i;
		for(i=0;i<15;i++) {
			amount += deposit;
			deposit *= 2;
		}
		System.out.println(amount);
//		-------------------------------------------------
//		해석
//		
		int day; //날짜
		int money=10; //예금액
		int total=0; //총 금액
		
//		day, 0~14, x15
		for(day=0;day<15;day++) {
		
//			총 금액에 추가하기
			total += money;
			
//			예금액 2배로 증가시키기
			money *= 2;
		}
		System.out.println("예금 총액 : "+total+"원");
		
		
		
		
	}//main

}//class
