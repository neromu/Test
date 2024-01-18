package java12_Exception_custom;

//Checked Exception 정의
public class UserAgeException extends Exception{
	
	@Override
	public String getMessage() {
//		예외 메시지를 반환하는 메소드 - 예외가 발생한 이유
		return "나이는 0보다 작거나 150보다 클 수 없다";
	}
	
	
	
}
//Unchecked Exception 정의
//public class UserAgeException extends RuntimeException{
//	
//	
//	
//	
//}