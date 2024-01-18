package java05_Array.Quiz;

public class ArrayQuiz_02_2 {

	public static void main(String[] args) {
		
		int[] arr = {10,17,3,9,27,10,8,9,13,21};
		int result=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i%2==0) {
				result += arr[i];
			}else if(i%2 !=0) {
				result -= arr[i];
			}
			
		}
		
		
		
		System.out.println("결과 : "+result);
		

	}

}
