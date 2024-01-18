package java07_inherit.practice.controller;


import java.util.Scanner;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Rectangle;

public class Main {
	public static void main(String[] args) {
		
//		Circle ci1 = new Circle();
//		Circle ci2 = new Circle();
//		Circle ci3 = new Circle();
//		Rectangle re1 = new Rectangle();
//		Rectangle re2 = new Rectangle();
//		Rectangle re3 = new Rectangle();
//		ci1.draw();
//		re1.draw();
		
		Circle[] ci = new Circle[3];
		Rectangle[] re= new Rectangle[3];
		
		int[] x = {5,9,7},y = {8,6,4}; 
		int[] radius= new int[3];
		int[] width = new int[3], height = new int[3];
		for (int i = 0; i < re.length; i++) {
			System.out.println((1+i)+"번째Rectangle 시작");
			width[i] = x[i];
			height[i] = y[i];
			re[i] = new Rectangle(x[i],y[i],width[i],height[i]);
			re[i].draw();
			System.out.println((1+i)+"번째Rectangle 끝");
		}
		
		for (int i = 0; i < ci.length; i++) {
			System.out.println((1+i)+"번째 Circle 시작");
			radius[i] = x[i];
			ci[i] = new Circle(x[i],y[i],radius[i]);
			ci[i].draw();
			System.out.println((1+i)+"번째 Circle 끝");
		}
		
		
		
		
		
		
		
	}//main
}//class
