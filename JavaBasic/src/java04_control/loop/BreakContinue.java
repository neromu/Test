package java04_control.loop;

import java.util.Iterator;

public class BreakContinue {

	public static void main(String[] args) {
//		기타 제어문, 보조 제어문
		
//		break;
//		반복문(for, while, do-while) 또는 switch문을 중단시키는 코드
		for(int i=0;i<100;i++) {
			
			
			
//		중첩된 제어문에서 break를 사용하면 가까운 블록의 제어문	
//		한 개만 중단한다	
//		-> 안쪽 제어문에서 바깥쪽  for문을 중단시킬 수 없다	
			System.out.println(i);
			
			
			if(i>=5) {
				break;
			}//if
		}//for
		
		for (int i=0; i<5; i++) {
			
			for(int j=0; j<5;j++) { //break;
//				break;
				
				System.out.println("i : "+i+", j : "+j);
				
			}
			System.out.println();
			
		}
		
		System.out.println("--------------------------------");
//		---------------------------------------
		
//		continue;
//		반복문에서만 사용할 수 있는 제어문
		
//		현재 반복코드를 중단하고 다음 반복을 수행한다
//		반복문의 {}중괄호 블록의 남은 부분을 1번 건너뛴다
		
		for(int i=0; i<11; i++) {
			if(i%2==0) {//짝수
				continue;
				
			}
			System.out.println(i);
			
		}
//		continue 만나면 ->조건문 -> 증감식 으로 실행
		
		
//		while의 경우 무한 루프에 빠질 수 있음.
//		while문의 continue는 조건식으로 가기때문에
//		증감식을 만나지 못하고 조건 검사만 반복적으로 수행한다
		int i=0;
		while( i<11 ) {
			if(i%2==0) {//짝수
				continue;
				
			}
			System.out.println(i);
			i++;
		}
		
//		---------------------------------------
//		for문에서 continue는 증감문으로 간다 
		
//		while, do-while에서는 continue는 조건문으로 간다
	}//main

}//class
