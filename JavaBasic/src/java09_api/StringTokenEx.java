package java09_api;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenEx {

	public static void main(String[] args) {
		
//		문자열 토큰, String Token
//		-> 특정 규칙을 이용해서 문자열을 구분하는 단위
		
//		ex) "1,2,3,4,5"
//		 -> ","를 이용해서 구분한다 --구분자( delimiter )
//		 -> 토큰 : "1","2","3","4","5"
//		------------------------------------------------
		
//		문자열의 토큰화(Tokenize)
		
		String data1 = "HI HELLO HOLA";
		
		String[] tokens = data1.split(" ");
		for (String string : tokens) {
			System.out.println(string);
		}
		
		System.out.println("--------------");
		
		String data2 = "I!@#!am!@#!spider!@#!man";
		tokens = data2.split("!@#!");		
		for(String token : tokens) {
			System.out.println(token);
		}
		
		System.out.println("--------------");
		
//		클래스.
		StringTokenizer st1 = new StringTokenizer(data1); //기본 구분자 : 공백문자
		
		System.out.println("토큰의 개수 : " + st1.countTokens());
		
//		.nextToken() 메소드
		
//		.hasMoreTokens() 메소드
//		앞으로 .nextToken()을 했을 때 반환될 토큰이 존재하는 가 true/false가 반환 값.
		
		
//		토크인이 존재하는만큼 반복하기
//		while( st1.hasMoreToken() ) {
//			System.out.println(st1.nextToken()); 
//		}
		
		
		
		System.out.println("--------------");
		
		StringTokenizer st2 = new StringTokenizer(data2, "!@#!");
		
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		System.out.println(st2.nextToken());
		
//		System.out.println(st2.nextToken());
//		에러, NoSuchElementException 
//		-> nextToken()으로 반환할 데이터가 더 이상 존재하지 않는다
		
	}

}
