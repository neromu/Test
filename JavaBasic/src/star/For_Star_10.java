package star;

public class For_Star_10 {
	public static void main(String[] args) {
//		Q10.		
		System.out.println("Q10.");
	
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i<=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
//		---------------------------------
		System.out.println("Q10.");
		
		for(int i=5; i>0; i--) {
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
