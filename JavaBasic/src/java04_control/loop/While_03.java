package java04_control.loop;

public class While_03 {

	public static void main(String[] args) {
//		while문을 이용한 구구단 출력
//		-> 2~9단 전부 출력
		
		int i = 2;
		while(i<=9) {
			int j=1;
			while(j<=9) {
				
				System.out.print(i+"x"+j+"="+(i*j)+"\t");
				j++;
			}
			
			System.out.println();
			
			i++;
		}
		
//		int dan=2;
//		while(dan<=9) {
//			int i=1;
//			while(i<=9) {
//				
//				System.out.print(dan+"x"+i+"="+(dan*i)+"\t");
//				i++;
//			}
//			
//			System.out.println();
//			
//			dan++;
//		}
		
		
		
		
	}

}
