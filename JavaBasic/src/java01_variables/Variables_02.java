package java01_variables;

public class Variables_02 {

	public static void main(String[] args) {
		
		// 각 유형의 대표 자료형
		// int, double, boolean, char
		//-----------------------------------
		
		// int 타입의 변수 공간 선언(Declaration)
		int data;
		// -> int형 데이터를 저장할 수 있는 메모리 공간(변수)가 생성됨
		
		// data 변수 공간에 값을 대입(Assignment)
		data = 17;
		// -> data 변수에 17이라는 값을 저장
		
		// 값 대입
		data = 999;
		// -> data 변수에 저장된 17을 지우고 새롭게 999를 저장
		
		// data 변수에 저장된 17을 불러와서 콘솔에 출력
		// -> 999를 대입한 이후에는 999를 출력
		System.out.println(data);
		
	}
	
}