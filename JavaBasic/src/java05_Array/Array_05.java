package java05_Array;

public class Array_05 {

	public static void main(String[] args) {
		
//		문자열
		String str = "Apple";
		
//		---------------------------------------------------
		
//		String배열
		String[] strArr;
		
//		The local variable strArr may not have been initialized
//		쓰레기값.
//		System.out.println(strArr);
		
//		String배열 공간(요소) 생성 (3개)
		strArr = new String[3]; //참조형 기본값 null 대입됨
		
		strArr[0] = "Apple";
		strArr[1] = "Banana";
		strArr[2] = "Cherry";
		
//		전체 문자열 출력
		
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
			System.out.println(strArr[i].length());
			System.out.println("-----------------");
		}
		
//		strArr -> String[]
//		strARR.length -> 배열의 길이 (3개의 문자열)
		
//		strArr[i] -> String
//		strArr[i].length() -> i 인덱스 문자열의 길이
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main

}//class
