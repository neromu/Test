package java06_class.uml.manage2;

import java.util.Scanner;

public class StudentService_02 {
	
	private Student[] stu = new Student[3];
	private Scanner input = new Scanner(System.in);
	
	public StudentService_02() {
		for (int i = 0; i < stu.length; i++) {
			stu[i] = new Student();			
			
		}
	}
	
	public void menu() {
		System.out.println("-----M E N U-----\t");
		System.out.println("1. 1번 학생 입력\t");
		System.out.println("2. 2번 학생 입력\t");
		System.out.println("3. 3번 학생 입력\t");
		System.out.println("4. 1번 학생 조회\t");
		System.out.println("5. 2번 학생 조회\t");
		System.out.println("6. 3번 학생 조회\t");
		System.out.println("7. 전체 학생 조회\t");
		System.out.println("8. 종료\t");
		System.out.println("-----M E N U-----\t");
		System.out.print("숫자를 입력해주세요. (종료 : 8) :");
	}
	
	
	
	
	public void nameAgeGrade(int num) {
		
			nameAgeOne(stu[num]);
			gradeOne(stu[num]);
		
	}
	
	public void nameAgeOne( Student stu) {
		System.out.print("이름 : ");
		stu.setName(input.nextLine());
		System.out.print("나이 : ");
		stu.setAge(input.nextInt());
		
	}
	public void newlineD() {
		input.nextLine();
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
	
	public void print(int num) {
		printOne(stu[num]);
		
	}
	public void printall() {
		for (int i = 0; i < stu.length; i++) {
			printOne(stu[i]);
		}
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
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
