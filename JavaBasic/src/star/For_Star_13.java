package star;

public class For_Star_13 {
	public static void main(String[] args) {
//		Q13.
		System.out.println("Q13.");
		for(int i=9; i>=0; i--) { // i , 9~0  x10
			
			if(i>(9/2)) {
				for(int j=5; j<=i; j++) {
					System.out.print("*");
				}//for02
				
			}else {
				for(int j=(5-i); j>0; j--) {
					System.out.print("*");
				}//for03
			}//else
			System.out.println();
		
		}//for01
	}//main
}//class
