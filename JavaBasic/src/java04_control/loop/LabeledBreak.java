package java04_control.loop;

public class LabeledBreak {
	
	public static void main(String[] args) {
//		표식이 붙여진 break
//		label 기능이 남아 있는게 labelbreak, switch
		
//		function -> Java에서는 method
		
//		label -> 아래 for문에 A라는 이름
		OuterLoop:
		for(int i=0; i<5; i++) {
			
			InnerLoop:
			for(int j=0; j<5; j++) {
				System.out.println("i: "+i+", j: "+j);
				
				if(j>=2) {
//					break;
//					break InnerLoop;
//					break OuterLoop;
				}
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
