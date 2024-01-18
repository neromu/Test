package java04_control.loop;

public class For_10_2 {

	public static void main(String[] args) {
		
//		Quiz. 2~9단 구구단 출력
		
//		for(int i=2; i<10; i++) { // i, 2~9, x8
//			for(int j =1; j<10; j++) {
//				System.out.print( i+ "x" + j + "=" + (i*j) +"\t");
//			}
//			System.out.println();
//		}
		
		for(int i=1; i<=9; i++) { // i, 2~9, x8
			for(int dan =2; dan<=9; dan++) {
				System.out.print( dan+ "x" + i + "=" + (i*dan) +"\t");
			}
			System.out.println();
		}
		
		
//		구구단 3x3사이즈 출력
//	for(int i=1; i<10; i+=3) {
//		
//		for(int j=1;j<10;j++) {
//			System.out.print(i+"x"+j+"="+(i*j));
//			System.out.print("    |    ");
//			System.out.print((i+1)+"x"+j+"="+((i+1)*j));
//			System.out.print("    |    ");
//			System.out.println((i+2)+"x"+j+"="+((i+2)*j));
//		System.out.println("----------------------------------------");
//			}
//		}
		
	}//main

}//class
