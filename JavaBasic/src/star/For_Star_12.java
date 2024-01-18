package star;

public class For_Star_12 {
	public static void main(String[] args) {
//		Q12.
		System.out.println("Q12.");
		for(int i=1; i<10; i++) {
			if(i<=(10/2)) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}//for02
			}else {
				for(int j=10; j>i; j--) {
					System.out.print("*");
				}//for03
			}//else
			System.out.println();
		}//for01
	}//main
}//class
