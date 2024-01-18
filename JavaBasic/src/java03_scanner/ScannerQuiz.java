package java03_scanner;

import java.util.Scanner;

		//3과목 점수 관리 프로그램

		// 국어, 영어, 수학
		// 점수를 저장할 수 있는 변수를 만들고
		// 3과목 점수를 입력받는다
		
		// 총점과 평균을 포함한 결과를 출력
		
		// ex)
		// =====입력=====
		// Input Korean : 100
		// Input English : 99
		// Input Mathematics : 97
		
		// =====출력=====
		// 국어 영어 수학 총점 평균
		// 100 99 97 296 98.66666666666667

public class ScannerQuiz {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		
		// 키보드 입력 (객체)
		Scanner sc = new Scanner(System.in);
		
		//------------------------------------------------
		
		// 국어 점수 입력
		System.out.print("Input Korean : ");
		int kor = sc.nextInt();
		
		// 영어 점수 입력
		System.out.print("Input English : ");
		int eng = sc.nextInt();
		
		// 수학 점수 입력
		System.out.print("Input Mathematics : ");
		int math = sc.nextInt();
		
		// 총점 계산
		int sum = kor + eng + math;

		// 평균 계산
		double avg = sum / (double)3;
		
		//전체 출력
		System.out.println();
		
		System.out.println("----------------출력----------------");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg);
		
	}

}