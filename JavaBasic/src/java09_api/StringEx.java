package java09_api;

public class StringEx {

	public static void main(String[] args) {
		
		String str1 = "Apple"; //리터럴 상수 적용 방법		
//															Stack
//		str1 => main() 지역변수   상수 Data Code ㅁ <-------str1
//		str2 => main() 지역변수   							str2------->인스턴스 Heap ㅁ
		String str2 = new String("Banana"); //객체로 생성 (동적 할당)
		
//		------------------------------------------------------
		
		System.out.println("---- length() ----");
		
		System.out.println("str1의 길이 : "+str1.length());
		System.out.println("str2의 길이 : "+str2.length());
		
		System.out.println("\"Cherry\"의 길이 : "+  "Cherry".length());
//							\를 escape 시퀀스 라고함
		
//		----------------------------------------------------
		System.out.println("\n--- toLowerCase() -----");
//		str1 문자열의 모든 알파벳을 소문자로 변경한 결과를 반환한다
		System.out.println("str1 toLowerCase : "+str1.toLowerCase());
		
		System.out.println("\n--- toUpperCase() -----");
//		str2문자열의 모든 알파벳을 대문자로 변경한 결과를 반환한다
		System.out.println("str2 toUpperCase : "+str2.toUpperCase());
		
		System.out.println("\n--- CharAt( int ) -----");
//		str1의 3번째 인덱스 값을 추출한다
		System.out.println("str1 [3]인덱스 : "+str1.charAt(3));
		
		System.out.println("\n--- replace( char, char) -----");
//		str2 문자열의 'n'을 'X'로 변환한다
		System.out.println("str2 n->X : "+str2.replace('n', 'X'));
		
		System.out.println("\n--- contains() -----");
//		특정 문자열을 포함하고 있는지 확인한다
		System.out.println("str1 문자열 an 확인 : "+str1.contains("an"));
		System.out.println("str2 문자열 an 확인 : "+str2.contains("an"));
		
		
		System.out.println("\n-----------substring() -------------");
//		문자열의 일부를 발췌한다. 
		
		String sub1 = str1.substring(2); //2번 인덱스 부터
		
		System.out.println("sub1 : "+sub1);
		
		String sub2 = str1.substring(1,3); //1(포함)~3(미포함) 인덱스
		
		System.out.println("sub2 : "+sub2);
		
	}

}
