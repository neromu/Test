package java10_collection;

import java.util.Stack;

public class Collection_08_Stack {

	public static void main(String[] args) {
		
//		스택 자료구조
		
//		LIFO , Last Input First Output : 후입선출
//		FILO , First Input Last Output : 선입후출
		
//		가장 마지막(최근)에 입력된 데이터를 가장 먼저 사용한다 
//		----------------------------------------------
		
//		메소드
//		push()	:데이터 입력
//		pop() 	:데이터 출력 및 삭제
		
//		peek()	:데이터 확인, pop() 될 데이터를 확인한다 (삭제하지 않음)
		
		Stack stack = new Stack();
		
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		System.out.println(stack);
		System.out.println("---------------------------------");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("---------------------------------");
//		System.out.println(stack.pop());
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
	}

}
