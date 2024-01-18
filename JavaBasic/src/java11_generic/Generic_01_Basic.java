package java11_generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Generic_01_Basic {
	
	public static void main(String[] args) {
		
//		public class ArrayList<E>
//		클래스를 정의할 때 <E>로 제네릭 타입을 적용한다 E <= 식별자  Element
//		클래스의 내부 코드에서 E 를 자료형으로 사용할 수 있다
		
//		클래스의 생성할 때 개발코드 제네릭 타입을 결정해서 사용한다
//		--------------------------------------------------------------
		
//		ArrayList<E> list;
//		타입파라미터 E를 String으로 결정하여 객체 변수 선언
		ArrayList<String> list;
		
//		타입 파라미터를 결정하지 않으면 "raw type"이라고 부른다
//		-> Object 타입으로 자동 결정된다
		ArrayList list2;
		
//		-------------------------------------------------------------
		
//		 <> 원래는 E 들어가있었음. 
//		new 할 때는 <> 안 생략해도 됨.
		list = new ArrayList<>();

		list.add("Apple");
		list.add("Banana");
		
//		에러, 타입파라미터를 String으로 결정했기때문에 String만 사용 가능하다
//		list.add(12345);
		
//		------------------------------------------------------------
		
//		에러, 타입파라미터에는 기본 데이터타입을 사용할 수 없다
//		ArrayList<int> list3;
		
//		wrapper 클래스를 적용한다
		ArrayList<Integer> list3 = new ArrayList<>();
		
		list3.add(123);
		list3.add(345);
		list3.add(567);
		
//		-----------------------------------------------------
		
//		**타입 안정성, Type Safety
//		객체 또는 메소드가 의도한 데이터타입으로만 사용되는 상황
//		의도치 않은 형변환, 대입 등을 사전에 차단시키는 것
		
//		제네릭타입( 타입 파라미터)을 특정 데이터타입으로
//		결정해야만 "타입 안정성"이 제공된다
		
		
//		->결정하지 않으면 "raw type" -타입 안정성이 없음
		
		ArrayList list4 = new ArrayList();
		
		list4.add("HI");
		list4.add("Hello");
		list4.add("HOLA");
		
//		에러, Object타입으로 반환된다
//		String str = list4.get(1);

//		형변환이 필요하다
		String str = (String) list4.get(2);
		
//		-----------------------------------------------------
		
		ArrayList<Integer> list5 = new ArrayList<>();
		
		list5.add(100);
		list5.add(200);
		list5.add(300);
		
		int data = list5.get(1);
		
		System.out.println("-------------");
		
		Iterator<Integer> iter = list5.iterator();
		while(iter.hasNext()) {
			int val = iter.next();
			System.out.println(val);
		}
		
	}

}
