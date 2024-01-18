package java02_operator;

public class Unary_02 {

	public static void main(String[] args) {

		// 단항 연산자 - 증감
		
		// ++ : 증가 연산자
		// -- : 감소 연산자
		
		// 피연산자로 적용한 변수에 저장된 값을 1 증가/감소 시킴
		
		//---------------------------------------------------------------------------------------------------
		
		int num;
		
		num = 15;
		num++;  // num 변수에 저장된 값을 1 증가시킴
		
		System.out.println(num);
		
		++num;
		System.out.println(num);
		
		System.out.println("---");
		
		num = 15;
		num--;  // num 변수에 저장된 값을 1 감소시킴
		
		System.out.println(num);
		
		--num;
		System.out.println(num);
		
		System.out.println("---");
		
		// 증감 연산자는 다른 연산식과 같이 사용할 때 계산법이 달라짐
		// -> 변수의 앞에 적용했는지 뒤에 적용했는지에 따라 달라짐
		
		//---------------------------------------------------------------------------------------------------
		
		num = 15;
		
		System.out.println(num);     // 15 출력
		System.out.println(num--);   // 15 출력 -> 14 저장  // 감소연산자 적용, 후치 감소, 후위 감소
		// -> 감소 구간
		System.out.println(num);     // 14 출력
		
		System.out.println("---");
		
		num = 15;
		
		System.out.println(num);     // 15 출력
		System.out.println(--num);   // 14 출력              // 감소연산자 적용, 전치 감소, 전위 감소
		System.out.println(num);     // 14 출력
		
		System.out.println("---");
		
		// 전위 증감연산은 변수의 값을 불러오기 전에 증감함
		// 후위 증감연산은 변수의 값을 불러온 후에 증감함
		
		//---------------------------------------------------------------------------------------------------
		
		num = 13;
		
		System.out.println(num++ - 10 - ++num);
//		System.out.println(13 - 10 - 15);  // num++ -> 13출력 후 14저장  // ++num -> 14 + 1 = 15 계산 후 출력
//		System.out.println(-12);
		
		System.out.println("---");

		
	}

}