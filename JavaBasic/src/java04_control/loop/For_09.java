package java04_control.loop;

public class For_09 {

	public static void main(String[] args) {
//		 for문 중첩, 2중 for문
		
		for(int i=0; i<3; i++) {//i, 0~2 ,x3
			for(int j =0; j<3; j++) {//j, 0~2 ,x3
				System.out.println("i : "+i+" , j : "+j);
			}
			System.out.println("-----------------");
		}
	}//main

}//class
