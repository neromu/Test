package star;

public class For_Star_11 {
	public static void main(String[] args) {
//		Q11.		
		System.out.println("Q11.");
		
		for(int i=1; i<=5; i++) {
			for(int j=5; j>0; j--) {
				if(i>=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
	}
}
