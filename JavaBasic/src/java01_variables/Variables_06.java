package java01_variables;

public class Variables_06 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
//		System.out.println(11+22);
		
		//-----------------------------------------------------------
		
		// 리터럴 상수
		System.out.println(3465L);
		System.out.println(244.534f);
		
		//-----------------------------------------------------------
		
		// 변수
		int num;
		num = 123;
		num = 456;
		num = 789;
		
		//-----------------------------------------------------------
		
		// 이름있는 상수
		// 변수의 상수화
		final int MAX;
		
		// 이름있는 상수의 식별값은 모든 글자를 대문자로 작성
		MAX = 100;
		
		// 에러, 상수화된 변수는 값 대입을 한 번만 할 수 있음
//		MAX = 200;
		
		// 연결된 식별자들 함께 변경하기 : alt + shift + r
		// (우클릭 메뉴 - Refactor - Rename)
		
		//-----------------------------------------------------------
		
		final int WORKING_DAY = 25;
		
		System.out.println("이번 달은 " + WORKING_DAY + "일 근무 하셨습니다");
		System.out.println("이번 달 급여 : " + WORKING_DAY * 150000);
		
		// 선택영역 대문자로 변환 : ctrl + shift + x
		// 선택영역 소문자로 변환 : ctrl + shift + y
		
	}

}