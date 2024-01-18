package java08_abstract.interfaceEx;

import java08_abstract.interfaceEx.multiple.Child;
import java08_abstract.interfaceEx.multiple.Inter_01;
import java08_abstract.interfaceEx.multiple.Inter_02;
import java08_abstract.interfaceEx.multiple.Parent;

public class InterfaceEx_02 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.out();
		
		System.out.println("-----------------------");
		
		Parent p = new Parent();
		p.out();
		
		System.out.println("-----------------------");
		
		Parent pc = new Child();
		pc.out(); //동적 바인딩 -> 자식 클래스의 메소드가 호출된다
		
		System.out.println("-----------------------");
		
		Inter_01 i01;
		
//		추상 클래스를 익명클래스 생성해서 사용하게됨
//		i01 = new Inter_01() {
//			
//			@Override
//			public void out() {
//				// TODO Auto-generated method stub
//				
//			}
//		};
		
		i01= new Child();
//		child 인스턴스로 inter_01 자료형
		i01.out(); //동적 바인딩
		
		System.out.println("-----------------------");
		
		Inter_02 i02;
		i02 = new Child();
		
		i02.out();//동적 바인딩 
		
//		**extends 클래스, implements 인터페이스 모두 부모 데이터타입으로 사용된다
//		---------------------------------------------------------
		int[] arr = { 1,2,3,4,5};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-----");
//		    int  int배열
		for( int num : arr ) {
			System.out.println(num);
		
		}
		
//		---------------------------------------------------------
		
		Child[] childs = new Child[10];
		
		for(int i =0; i<childs.length;i++) {
			childs[i] = new Child();
		}
		
//		for each 구문 작성 시
//		   참조형변수	배열
		for(Child ch :  childs ) {
			ch = new Child();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
