package java07_inherit.practice.controller;


import java.util.Scanner;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main2 {
	public static void main(String[] args) {
		
		Circle[] circles = new Circle[3];
		Rectangle[] rectangles= new Rectangle[3];
		
		int[] x = {5,9,7},y = {8,6,4}; 
		int[] radius= new int[3];
		int[] width = new int[3], height = new int[3];
		for (int i = 0; i < rectangles.length; i++) {
			System.out.println((1+i)+"번째Rectangle 시작");
			width[i] = x[i];
			height[i] = y[i];
			rectangles[i] = new Rectangle(x[i],y[i],width[i],height[i]);
			rectangles[i].draw();
//			System.out.println((1+i)+"번째Rectangle 끝");
		}
		
		for (int i = 0; i < circles.length; i++) {
			System.out.println((1+i)+"번째 Circle 시작");
			radius[i] = x[i];
			circles[i] = new Circle(x[i],y[i],radius[i]);
			circles[i].draw();
//			System.out.println((1+i)+"번째 Circle 끝");
		}
		
//		---------------------------------------------
		System.out.println("----------------------");
		Point[] points = new Point[5];
		points[0] = new Circle();
		points[1] = new Rectangle();
		points[2] = new Circle();
		points[3] = new Rectangle();
		points[4] = new Circle();
		
		for (int i = 0; i < points.length; i++) {
			points[i].draw();
		}
		
		
		int a = (int)(Math.random()*10);
		System.out.println(a);
		
		
		
		
	}//main
}//class
