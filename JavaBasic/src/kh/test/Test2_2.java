package kh.test;

import java.util.ArrayList;

public class Test2_2 {
	public static void main(String[] args) {
		
		ArrayList<Fruit> list = new ArrayList<>();
		list.add(new Fruit("사과","빨강"));
		list.add(new Fruit("메론","초록"));
		list.add(new Fruit("포도","보라"));
//		list.add("맛있는 과일"); //삭제
		

		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
