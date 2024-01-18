package java09_api;

import java.util.Random;

public class Lotto {

//		로또 번호 생성기
//		1~45 추출 중복 x
//		6개 자리
//		중복되지 않도록
//		-----------------------------------------
		
//		랜덤 객체
		private Random ran = new Random();
		
		public void makeLotto(int[] lotto) {
			int c=0;
			A:
			for (int i = 0; i < lotto.length; i++) {
				
//				로또번호 핸덤 추출
				int num = ran.nextInt(45)+1;
				
//				---중복 값 제거하기---
//				if(중복 찾음) {
//					i--;
//					continue A;
//				} //이런 방법도 존재

//				여기서 사용된 boolean 변수 =>flag 를 사용했다.
//				중복 체크 플래그(flag) 변수
				boolean isExist = false;  
				for(int j=0; j<i; j++) { //이전에 생성했던 랜덤 숫자들 반복
					if(lotto[j] == num ) { //중복된 값이 이미 존재할 경우
						c++;
						isExist = true;
					};        
				};
				
//				중복값 발견
				if(isExist) {
					i--; 
					continue;
				}
				
//				----------------------
				
				
//				랜덤값 배열에 대입하기
				lotto[i] =num;
			
			}
			System.out.println(c);
			
		}
		
		public void makeLotto2(int[][] lotto2 ) {
			
			for (int i = 0; i < lotto2.length; i++) {
				this.makeLotto(lotto2[i]);
				
			}
			
			
			
		}
		
		
		
		
}

