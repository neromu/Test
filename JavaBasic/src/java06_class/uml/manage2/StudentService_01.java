package java06_class.uml.manage2;

import java.util.Scanner;

public class StudentService_01 {
	
	private Student[] stu = new Student[3];
	private Scanner input = new Scanner(System.in);
	
	public StudentService_01() {
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student();			
			nameAge(stu[i]);
		}
	}
	
	public void nameAge(Student stu) {
		
			nameAgeOne(stu);
			gradeOne(stu);
			printOne(stu);
		
	}
	public void nameAgeOne( Student stu) {
		System.out.print("이름 : ");
		stu.setName(input.nextLine());
		System.out.print("나이 : ");
		stu.setAge(input.nextInt());
		
		
	}
	
	public void grade() {
//		System.out.print("국어 : ");
//		stu.setKor(input.nextInt());
//		System.out.print("영어 : ");
//		stu.setEng(input.nextInt());
//		System.out.print("수학 : ");
//		stu.setMath(input.nextInt());
//		sum();
//		avg();
	}
	public void gradeOne(Student stu) {
		System.out.print("국어 : ");
		stu.setKor(input.nextInt());
		System.out.print("영어 : ");
		stu.setEng(input.nextInt());
		System.out.print("수학 : ");
		stu.setMath(input.nextInt());
		sum(stu);
		avg(stu);
	}
	
	public void sum(Student stu) {
		stu.setSum(stu.getEng()+stu.getKor()+stu.getMath());
	}
	public void avg(Student stu) {
		stu.setAvg(stu.getSum()/(double)3);
	}
	
	public void print() {
//		System.out.print("이름\t나이\t국어\t영어\t수학\t총계\t평균");
//		System.out.println();
//		
//		System.out.print(stu.getName() +"\t");
//		System.out.print(stu.getAge()+"\t");
//		
//		System.out.print(stu.getKor()+"\t");
//		System.out.print(stu.getEng()+"\t");
//		System.out.print(stu.getMath()+"\t");
//		
//		System.out.print(stu.getSum()+"\t");
//		System.out.printf("%.2f",stu.getAvg());
//		
		
		
	}
	public void printOne(Student stu) {
		System.out.print("이름\t나이\t국어\t영어\t수학\t총계\t평균");
		System.out.println();
		
		System.out.print(stu.getName() +"\t");
		System.out.print(stu.getAge()+"\t");
		
		System.out.print(stu.getKor()+"\t");
		System.out.print(stu.getEng()+"\t");
		System.out.print(stu.getMath()+"\t");
		
		System.out.print(stu.getSum()+"\t");
		System.out.printf("%.2f",stu.getAvg());
		System.out.println();
		input.nextLine();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
