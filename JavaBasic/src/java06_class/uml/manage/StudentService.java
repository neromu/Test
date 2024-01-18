package java06_class.uml.manage;

import java.util.Scanner;

public class StudentService {
	
//	멤버필드
	private Student stu;
	private	Scanner input;
	
//	생성자
	public StudentService() {
		stu = new Student();
		input = new Scanner(System.in);
	}
	
	
//	멤버메소드
	public void insertInfo() {
//		System.out.println("insertInfo call");
		System.out.print("이름 : ");
		stu.setName(input.nextLine());
		System.out.print("나이 : ");
		stu.setAge(input.nextInt());
//		System.out.println("insertInfo Done");
		
	}
	public void insertScore() {
//		System.out.println("insertScore call");
		System.out.print("국어 점수 : ");
		stu.setKor(input.nextInt());
		System.out.print("영어 점수 : ");
		stu.setEng(input.nextInt());
		System.out.print("수학 점수 : ");
		stu.setMath(input.nextInt());
		calcSum();
		calcAvg();
//		System.out.println("insertScore Done");
		
	}
	public void calcSum() {
//		System.out.println("calcSum call");
		int sum = (stu.getEng())+(stu.getKor())+(stu.getMath());
		stu.setSum(sum);
//		System.out.println("과목 합계 : "+stu.getSum());
//		System.out.println("calcSum Done");
	}
	public void calcAvg() {
//		System.out.println("calcAvg call");
		int sum = stu.getSum();
		stu.setAvg(sum/(double)3);
//		System.out.println("평균 : "+stu.getAvg());		
//		System.out.println("calcAvg Done");
	}
	public void printStu() {
//		System.out.println("---학생 정보---");
//		System.out.println("이름 : "+stu.getName());
//		System.out.println("나이 : "+stu.getAge());
//		System.out.println("국어 점수 : "+stu.getKor());
//		System.out.println("영어 점수 : "+stu.getEng());
//		System.out.println("수학 점수 : "+stu.getMath());
//		this.calcSum();
//		this.calcAvg();
		System.out.println();
		System.out.println("-------학생 정보--------");
		System.out.print("이름\t나이\t국어\t영어\t수학\t총점\t평균");
		
		System.out.println();
		System.out.print(stu.getName() +"\t");
		System.out.print(stu.getAge() +"\t");
		
		System.out.print(stu.getKor() +"\t");
		System.out.print(stu.getEng() +"\t");
		System.out.print(stu.getMath() +"\t");
		
		System.out.print(stu.getSum() +"\t");
		System.out.print("%2.f"+stu.getAvg() +"\t");
		
	}
	
	
	
	
	
	
	
	
	
	
}//class
