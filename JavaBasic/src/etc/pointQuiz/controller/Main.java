package etc.pointQuiz.controller;

import java.util.Scanner;

import etc.pointQuiz.model.Circle;
import etc.pointQuiz.model.Point;
import etc.pointQuiz.model.Rectangle;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Circle[] circles = new Circle[3];
		Rectangle[] rectangles = new Rectangle[3];
		int randomNum=0;
		
//		rad설정
//		System.out.print("반지름을 입력해주세요 :");
//		int rad = sc.nextInt();
		int rad,width,height;
		for (int i = 0; i < circles.length; i++) {
			System.out.println("----------"+i+"번째 원---------------");
			randomNum = (int)(Math.random()*10);
			randomNum = (int)(Math.random()*10);
			randomNum = (int)(Math.random()*10);
			circles[i] = new Circle(randomNum,randomNum,randomNum);
			System.out.println();
		}
		
		for (int i = 0; i < rectangles.length; i++) {
			System.out.println("----------"+i+"번째 사각형---------------");
			randomNum = (int)(Math.random()*10);
			randomNum = (int)(Math.random()*10);
			randomNum = (int)(Math.random()*10);
			randomNum = (int)(Math.random()*10);
			rectangles[i] = new Rectangle(randomNum,randomNum,randomNum,randomNum);
			System.out.println();
		}
//		--------------------------------------------------
		
		System.out.println("==================================");
		
		Point[] points = new Point[5];
		
		for (int i = 0; i < points.length; i++) {
			if(Math.random()*10 >=5) {
//				pt[i] = new Circle();
				randomNum = (int)(Math.random()*10);
				randomNum = (int)(Math.random()*10);
				randomNum = (int)(Math.random()*10);
				points[i] = new Circle(randomNum,randomNum,randomNum);
			}else {
//				pt[i] = new Rectangle();
				randomNum = (int)(Math.random()*10);
				randomNum = (int)(Math.random()*10);
				randomNum = (int)(Math.random()*10);
				randomNum = (int)(Math.random()*10);
				points[i] = new Rectangle(randomNum,randomNum,randomNum,randomNum);
			}
		}
		
		for (int i = 0; i < points.length; i++) {
			System.out.println("-----pt["+i+"]인덱스 의 인스턴스-------");
			
			points[i].draw();
			System.out.println();
		}
		
		
		
		
		
	}

}
