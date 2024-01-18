package java02_operator;

public class Binary_03 {

	public static void main(String[] args) {

		// 이항 연산자 - 관계, 비교
		
		// <  : less than (lt연산자)
		// >  : greater than (gt연산자)
		
		// <= : less than equal (le연산자)
		// >= : greater than equal (ge연산자)
		
		// == : equal (eq연산자)
		// != : not equal (ne연산자)
		
		// 왼쪽 피연산자를 기준으로 오른쪽 피연산자를 비교함
		// 비교 연산 결과를 참/거짓으로 반환
		// -> boolean 타입을 리턴
		// -> true / false
		
		//------------------------------------------------------------------------
		
		int num1 = 11;
		int num2 = 22;
		
		System.out.println("num1 == num2 : " + (num1==num2)); //eq - false
		System.out.println("num1 != num2 : " + (num1!=num2)); //ne - true
		System.out.println();
		
		System.out.println("num1 < num2 : " + (num1<num2)); //lt - true
		System.out.println("num1 > num2 : " + (num1>num2)); //gt - false
		System.out.println();
		
		System.out.println("num1 <= num2 : " + (num1<=num2)); //le - true
		System.out.println("num1 >= num2 : " + (num1>=num2)); //ge - false
		System.out.println();
		
		//------------------------------------------------------------------------
		
		boolean result = num1==num2;
		
		System.out.println("결과 : " + result);
		
	}

}