package etc;

public class ForQuiz_03 {

	public static void main(String[] args) {
//		1에서 1000까지의 정수중에서 4로 나누어도
//		6으로 나누어도 나머지가 1인 수의 합을 출력하라.
		
		int sum=0;
				
		for(int i=1; i<1000; i++) {
			if(i%4==1) {
				if(i%6==1) {
						sum += i;
				}
			}
			
		}
		System.out.println(sum);

	}//main

}//class
