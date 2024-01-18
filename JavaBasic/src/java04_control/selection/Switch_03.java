package java04_control.selection;

public class Switch_03 {

	public static void main(String[] args) {


//		에러
//		switch double사용 불가
//		double d =3.14;
//		switch( d ) {
//		
//		}
//		----------------------------------------------
		
//		에러
//		boolean b = true;
//		switch (b) {
//		
//		}
//		----------------------------------------------
		
//		char형은 정수값(ASCII)으로 처리된다
//		->switch 비교대상으로 사용 가능
//		char b = 'B';
//		switch (b) {
//		
//		case 'A':
//			System.out.println("사과");
//			break;
//		case 'B':
//			System.out.println("바나나");
//			break;
//		case 'C':
//			
//			break;
//		default:
//		}
//		----------------------------------------------

//		String타입은 switch구문에서 사용할 수 있다
//		-> jdk 1.7이상
//		String str="Banana";
//		
//		switch (str) {
//		case "Apple":
//			System.out.println("사과입니다");
//			break;
//		case "Banana":
//			System.out.println("바나나입니다");
//		break;
//		default:
//			break;
//		}
//		----------------------------------------------
		
		String str1 ="Cherry";//상수 활용
		
		String str2 =new String("Cherry");//객체 활용
		
		boolean a = str1 == str2;
		
		System.out.println(a);  //false
//		고로 ==로 String 비교하면 안됨
//		아래의 방식으로 비교.
		System.out.println( str1.equals(str2));
//		잘 사용되지 않고,
//		if문으로 비교 많이함
		if(str2.equals(str1)) {
			System.out.println("두 문자열이 똑같다!");
		}
		
//		== 동일비교
//		equls() 동등비교
		
	}//main

}//class
