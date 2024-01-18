package java05_Array;

public class Array_02 {

	public static void main(String[] args) {
		
		int[] arr1;			//배열 변수 선언
		arr1 = new int[7];	//배열 요소 생성
		
//		int[] arr2 = new int[13]; //배열 선언+ 생성
//		char[] arr2 = new char[13];
//		String[] arr2 = new String[13];
		
//		for(int i=0; i<13; i++) {
//			모든 요소가 기본값 0으로 초기화되어 있다
//			System.out.println(i+"인덱스 :"+arr2[i]);
//		}
//		**데이터타입들의 기본값
//		정수 - 0
//		실수 - 0.0
//		논리 - false
//		문자 - '\0'
		
//		참조 - null
		
//		-----------------------------------------------------------

//		선언과 동시에 초기화
		
//		int num =100;
		
//		-----------------------------------------------------------
		
//		배열 요소의 생성과 동시에 초기화시키기
		int[] arr3 = { 1,2,3,4,5 };

		System.out.println(arr3[3]);
//		아래와 같은 코드임.
//		arr3 = new int[5];
//		arr3[0] = 1;
//		arr3[1] = 2;
//		arr3[2] = 3;
//		arr3[3] = 4;
//		arr3[4] = 5;
		
//		-----------------------------------------------------------
		
//		Array constants can only be used in initializers
//		arr3 = { 100,200};
//		배열 초기화는 배열을 선언할 때에만 사용할 수 있다
		
//		-----------------------------------------------------------
		
		char[] chArr = {'A','p','p','l','e'};
		
		double[] dArr = {1.1, 2.2, 3.3, 4};
//		                               4.0으로 자동 형변환
//		for(int i=0; i<4; i++) {
//			System.out.println(dArr[i]);
//		}
		
		boolean[] bArr = { true, true, false };

	}//main

}//class
