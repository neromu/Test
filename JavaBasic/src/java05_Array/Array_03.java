package java05_Array;

public class Array_03 {

	public static void main(String[] args) {
		
		int[] arr = { 3123, 123,12,3, 112, 1231, 23, 432,45,65,4887,57 };
		
		
//		**배열의 길이
//		요소의 개수
//		배열의 크기
//		->배열이름. length
//		ex)   arr.length
//		----------------------------------------------------
		
		System.out.println("배열의 길이 : "+arr.length);
		System.out.println("----------------------");
		
//		배열의 모든 요소 출력하기 -for
//		 0 ~ arr.length-1
		for(int i = 0; i<arr.length; i++) {
			System.out.println(i+"인덱스 : "+arr[i]);
		}
//		----------------------------------------------------
		
//		for타이핑 , 자동완성
//		-> for문 자동완성에 배열의 길이만큼으로 추천된다
		for (int i = 0; i < arr.length; i++) {
			
		}
		
	}//main

}//class
