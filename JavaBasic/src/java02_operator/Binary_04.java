package java02_operator;

public class Binary_04 {

	public static void main(String[] args) {

		// 이항 연산자 - 논리
		
		// &&  : AND
		// ||  : OR
		// !   : NOT (단항 연산자)
		
		// 논리(boolean) 데이터의 관계를 따져서 결과를 반환함
		
		// AND 연산은 피연산자가 모두 true일 때 전체 결과가 true
		// OR 연산은 피연산자가 둘 중 하나라도 true일 때 전체 결과가 true
		// NOT 연산은 피연산자의 논리를 부정함 (반대로 바꿈)
		
		//-----------------------------------------------------------------------
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("true && false : " + (b1&&b2)); // false
		System.out.println("true || false : " + (b1||b2)); // true
		
		// +
		// XOR (eXclusive-OR) 연산은 왼쪽 항과 오른쪽 항이 서로 다른 경우 true
		
		//-----------------------------------------------------------------------
		
		int num = 77;
		
		System.out.println(num >= 1);
		System.out.println(num <= 100);
		
		// 에러
//		System.out.println(1 <= num <= 100);
		
		System.out.println(num>=1 && num<=100);
//		System.out.println((num >= 1) && (num <= 100)); // 같음
		
		//-----------------------------------------------------------------------
		
		num = 2000;
		num = -50;
		
		System.out.println(!(num>=1 && num<=100));
//		System.out.println(!(num>=1) !(&&) !(num<=100));
		System.out.println((num<1) || (num>100));
		
		// !(논리부정) 연산자의 적용
		// 관계 연산자를 반대 조건으로 치환
		// 논리연산자를 && -> || , || -> && 로 치환
		
	}

}