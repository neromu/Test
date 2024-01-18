package java09_api;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random ran;
		
		ran = new Random();
		
		System.out.println(ran.nextInt());
		System.out.println("---------------------");
		
		System.out.println(ran.nextBoolean()); // true / false
		System.out.println(ran.nextDouble());  // 0.0(포함) ~ 1.0(미포함)
		
		System.out.println("---------------------");
		
		System.out.println(ran.nextInt(100)); // 0~99 => 0부터 100개
		System.out.println(ran.nextInt(100)+1); // 1~100 => 0부터 100개
		
//		for(int i =0; i<10000000; i++) {
//			int d =ran.nextInt(100)+1;
//				if(d <1 || d>100) {
//					System.out.println("!!!!!!");
//				}
//		}
		System.out.println(ran.nextInt(3)+7); // 7~9
		
		
		
//		for(int i =0; i<100; i++) {
//			int d =ran.nextInt();
//				if(d == 0) {
//					System.out.println("!!!!!!");
//					System.out.println(d);
//					System.out.println("!!!!!!");
//				}
//		}
		
		
		System.out.println("----------------------------");
		
		
		for(int i =0; i<10; i++) {
			
			switch (ran.nextInt(3)) {
			case 0:
				System.out.println("가위");
				break;
			case 1:
				System.out.println("바위");
				
				break;
			case 2:
				System.out.println("보");
				
				break;

			default:
				break;
			}
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
