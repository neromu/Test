package java04_control.loop;

public class For_01 {

	public static void main(String[] args) {
		//for문, for loop
		
//		for(초기식; 조건식; 증감식) {
//		for(int i=0; i<5; i++) {
//			조건식이 참(true)일 때 실행하는 영역
//			반복적으로 실행하는 코드 영역
//			
//			조건식이 거짓이어야만 벗어난다
//		}
//		---------------------------------------------------
		
//		코드 반복을 조절하는 데 사용하는 변수
		int i;
		
		for( i=0; i<5; i++) {
			System.out.println("HI : "+i);
		}
//		System.out.println(i);
		
		System.out.println("-----------------------");
		
		System.out.println("for문이 끝난 이후 : "+i);
		
//		for문 실행 순서
//		1.초기식 실행
//		2.조건식 판단
//			2-1.true 일 때, -> 3
//			2-2.false 일 때 -> 반복문 탈출
//		3.{}중괄호 영역 실행
//		4.증감식 실행
//		5.2번 항목 실행
		
//		for(i=0;i<5;i++){
//		}
//		초기식 i=0;
//		조건식 i>5
//		증감식 i++
		
//		for문 읽는 방법
//		i 변수가 0부터 시작해서 	-초기식
//		i 변수가 5보다 작은 동안에	-조건식
//		i 변수를 1씩 증가시키면서 	-증감식
	}

}
