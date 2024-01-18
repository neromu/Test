package java04_control.selection;

public class Switch_02 {

	public static void main(String[] args) {
//		swich -case if, else if 로 작성 시
		int num = 30;
		
		if( num== 10) {
			System.out.println("10 이다");
		}else if( num == 20){
			System.out.println("20 이다");
		}else if( num == 30){
			System.out.println("30 이다");
		}else{
			System.out.println("모두 아님");
		}
		
//		--------------------------------------------------
//		switch는 범위 비교에서는 일반적으로 사용 불가능
//		다른 방법
		int score = 99;
		
		switch( score/10 ) {//10의 자리 숫자 추출
		
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;			
		case 7:
			System.out.println("C");
			break;
		default:	
			System.out.println("D");
			break;
		}
		
//		int score = 99;
//		if( score >= 90 ) {
//			System.out.println("A");
//		}else if( score >= 80 ) {
//			System.out.println("B");
//		}else if( score >= 70 ) {
//			System.out.println("C");
//		}else
		
//		--------------------------------------------------
		
	}//main

}//class
