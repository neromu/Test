package java12_Exception;

public class Exception_03_MultiCatch {

	public static void main(String[] args) {
		
		try {
//			try 블록
//			예외 발생이 예측되는 코드를 작성한다
//			예외발생시 가장 가까운 catch로 이동.
//			아래로 갈수록 상위 클래스를 작성해 주어야함, 혹은 형제 클래스
			
		}catch (NullPointerException e) {
//			NullPointerException 예외 발생시 예외 처리할 코드를 작성한다
			
		}catch (ArrayIndexOutOfBoundsException e) {
//			ArrayIndexOutOfBoundsException 예외 발생시 예외 처리할 코드를 작성한다
			
		}catch (Exception e) {
//			NullPointerException, ArrayIndexOutOfBoundsException
//			둘 모두 아닌 나머지 모든 예외 발생시 예외 처리할 코드를 작성한다
			
		}
		
//		--------------------------------------------------------------------------
		
//		Multi Catch 구문
//		->하나의 Catch구문에 여러 개의 예외 클래스를 적용하는 것
		
		try {
			
		} catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
			
		} catch(Exception e) {
			
		}
	}

}
