package java06_class.methodquiz;

public class MethodArrayQuizEx {

	public static void main(String[] args) {
		
		MethodArrayQuiz maq = new MethodArrayQuiz();
		int[] arr = {1,2,3,4,5};
		
//		1. arr배열의 모든 요소 10배가 되도록 작성
		maq.mul10(arr); // arr <-참조값을 가지게 됨
		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
//		2. arr배열의 모든 요소 출력되도록 작성
		maq.print(arr);
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
