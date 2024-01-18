package java04_control.loop;

public class For_07_1 {

	public static void main(String[] args) {
		
//		   Quiz.
//	   첫날에 10원을 예금하고,
//	   다음날에는 전날의 2배를
//	   예금하는 방식으로
//	   보름(15일) 동안 저축한 금액은?
//	      -> 327670
		int deposit=10,amount=0;
		for(int i=0;i<15;i++) {
			amount += deposit;
			deposit *= 2;
		}
		System.out.println(amount);
//		-------------------------------------------------
//		
		int total=0; 
//		1 -> {}
		for(int money=10,day=0;day<15;total += money,money *= 2,day++) {}
		System.out.println("예금 총액 : "+total+"원");
		
//		2 -> ;
		for(int money=10,day=0;day<15;total += money,money *= 2,day++)
			;
		System.out.println("예금 총액 : "+total+"원");
		
		
	}//main

}//class
