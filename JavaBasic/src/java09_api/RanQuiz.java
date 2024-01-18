package java09_api;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class RanQuiz {
	
	private Random ran = new Random();
	private String name;
	private Scanner sc= new Scanner(System.in);
	
	public RanQuiz() {
		this.name = "null";
		this.menu();
	}

	public RanQuiz(String name) {
		this.name = name;
	}
	
	public void menu() {
		System.out.println("----------------------------");
		System.out.println("----\t 미니 게임       -----");
		System.out.println("----1.\t Up & Down게임 -----");
		System.out.println("----2.\t Baskin 31 게임-----");
		System.out.println("----3.\t 종료          -----");
		System.out.println("----------------------------");
		
		System.out.print("번호를 입력해 주세요 : ");
		int num = sc.nextInt();
		
		switch (num) {
		case 1:
			this.updown();
			break;
		case 2:
			this.baskin();
			break;

		default:
			break;
		}
		
		
	}
	
	
	public void updown() {
		int count=1,num = ran.nextInt(50)+1;
		System.out.println("----\tUp & Down----");
		
		boolean victory = false;
			
		for(int i=0; i<7; i++) {
			System.out.print("숫자를 입력해 주세요. : ");
			int response = sc.nextInt();
			
			if(response == num) {
				System.out.println("정답입니다! ");
				victory = true;
				break;
			}else if(response > num) {
				System.out.println("Down");
			}else if(response < num) {
				System.out.println("Up");
			}
			count++;
//			if(victory) break;
		}
		System.out.println(name+"님의 결과");
		
		if(victory) {
			System.out.println("---WIN----");
			System.out.println("시도 횟수 : "+count);
		}else {
			System.out.println("---LOSE----");			
		}
		
		this.menu();
		
	}//updown method
	
	public void baskin() {
		int count=1;
		boolean victory = false;
		System.out.println("----\t Baskin 31 ---");
		
		do{
			System.out.println("현재 숫자 : "+(count-1));
			System.out.print("숫자를 입력해 주세요(1~3) :");
			int answer = sc.nextInt();
			System.out.print("입력된 숫자 :");
			for(int i =0; i<answer; i++) {
				if(i == (answer-1)){
					System.out.print(i+count);
				}else {
					System.out.print(i+count+", ");
				}
			}
			count += answer;
			System.out.println();
			
			System.out.print("컴퓨터 : ");
			
			int num = ran.nextInt(3)+1;
			switch (count) {
			case 30:
				System.out.print("31");
				victory = true;
				break;
			case 27:
				num=0;
			case 28:
				num++;
			case 29:
				num++;
			default:
				baskinComputer(num,count);
				count += num;
				break;
			}
		}while(count < 31);
		
		
		System.out.println(name+"님의 결과");
		
		if(victory) {
			System.out.println("---WIN----");
		}else {
			System.out.println("---LOSE----");			
		}
		
		this.menu();
		
	}
	
	public void baskinComputer(int num, int count) {
		for(int i =0; i<num; i++) {
			if(i == (num-1)){
				System.out.print(i+count);
				System.out.println();
			}else {
				System.out.print(i+count+", ");
			}
		}
		count += num;
		System.out.println();
		System.out.println();
	}
	
}
