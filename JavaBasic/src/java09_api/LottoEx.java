package java09_api;

import java.util.Arrays;

public class LottoEx {
	public static void main(String[] args) {
		
//		로또 번호
		int[] lotto = new int[6];
		int a = 0;
		
		Lotto l = new Lotto();
		l.makeLotto(lotto);
//		얕은 복사로 돌리는 방식
		
		Arrays.sort(lotto); //정렬
		System.out.println(Arrays.toString(lotto));
		
		System.out.println("------------------------------------");
		
		int[][] lotto2 = new int[5][6];
		
			
		l.makeLotto2(lotto2);
//		l.makeLotto(lotto2[1]);
//		l.makeLotto(lotto2[2]);
//		l.makeLotto(lotto2[3]);
//		l.makeLotto(lotto2[4]);
		
		for(int[] game : lotto2) {
			Arrays.sort(game);
		}
		for(int[] game : lotto2) {
			System.out.println(Arrays.toString(game));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main
}//class
