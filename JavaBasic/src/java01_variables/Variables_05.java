package java01_variables;

public class Variables_05 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// 학생의 나이
//		int student age; // 에러, 띄어쓰기 금지
		
		int student_age; // snake case, 뱀 표기법
		
		int studentAge; // camel case, 낙타 등 표기법
		
		// 자바에서는 낙타 등 표기법을 권장
		// 변수의 이름은 소문자로 시작
		
		//---------------------------------------------
		
		//에러, 숫자로 시작하면 안됨
//		int 1stNumber;
		
		int firstNumber;
		
		//---------------------------------------------
		
		// 에러, 예약어(키워드)는 사용할 수 없음
//		int int;
//		int static;
		
		//---------------------------------------------
		
		// **의미없는 변수명을 사용하지 않도록 함
		int a;
		int b;
		int c;
		
		//---------------------------------------------
		
		//에러
//		int _;
		
		// 알아보기 힘든 식별자를 사용하면 안됨
		int $;
		int ______;
		int __$$___$__$_$_;
		
		__$$___$__$_$_ = 333;
		
		System.out.println(__$$___$__$_$_);
		
		//---------------------------------------------
		
		int number;
		
		int number_;
		int _number;
		
		int $number;
		
		int number1;
		int number2;
		int number3;
		
		int maxNumber;
		
		//---------------------------------------------
		
		// 한글로 식별자를 설정하면 안됨
		double 넓이 = 5435.234;
		
		System.out.println(넓이);
		
	}

}