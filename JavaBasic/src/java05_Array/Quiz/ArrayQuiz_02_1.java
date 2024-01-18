package java05_Array.Quiz;

public class ArrayQuiz_02_1 {
	
	public static void main(String[] args) {
//		1.
		int[] arr = {10,17,3,9,27,10,8,9,13,21};
//		10개
//		System.out.println(arr.length);
//		2.
		int[] invert_arr = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			invert_arr[i] = arr[arr.length-1-i];
			System.out.print(invert_arr[i]+", ");
		}
		System.out.println();
		
	}//main
}//class
