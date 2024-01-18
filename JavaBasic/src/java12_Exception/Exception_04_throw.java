package java12_Exception;

import java.io.IOException;

public class Exception_04_throw {

	public static void main(String[] args) {
		
//		throw 키워드
//		->예외 상황(예외 객체)을 발생시키는 키워드
		
//		->개발자가 직접 예외를 발생(throw)시키기 위해 사용된다
//		----------------------------------------------------------
		
		String str = null;
		
//		System.out.println(str.length());
//		str = null --> NullPointerException
		
		
		if( str != null) {
			System.out.println(str.length());
			
		}else {
			System.out.println("[EXCEPTION] 문자열이 null입니다");
			
//			예외 객체를 직접 생성하여 예외를 발생시키는 코드
//			-> 예외 상황 던지기 (throw)
//			throw new NullPointerException();
		}
		
		System.out.println("----------------------------------------");
		
//		ArithmeticException: / by zero
//		System.out.println(999/0);
		
		
//		예외 정보 객체 생성
//		ArithmeticException ae = new ArithmeticException();
//		인스턴스 만들어지는 위치를 기억함.
		
//		예외 던지기 (예외 발생시키기)
//		throw ae;
		
//		**예외 객체를 생성(new)하는 것은 예외를 발생(throw)시키지 않는다
		
//		**new, throw 동작은 별개이다.
		
//		------------------------------------------------------------------
		
//		throw new ArithmeticException();
//		throw new ArithmeticException("문제 상황 설명을 적는다");
		
//		------------------------------------------------------------------
		
		try {
			
//			Checked Exception - try~ catch구문 필수
			throw new IOException();
			
		}catch(IOException e){
			
		}
	}

}
