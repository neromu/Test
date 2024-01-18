package java10_collection;

import java.awt.Window.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collection_01_List {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
//		빈( empty ) 리스트
		ArrayList<Object> list = new ArrayList();
//		<Object>  => raw type.
		
//		[] ( == empty )
		System.out.println(list);
		
		System.out.println();
		System.out.println("----데이터 삽입 ------");
		
//		.add()를 실행한 순서대로 인덱스를 부여받는다 ( 0부터 시작한다 )
		list.add(1);
		list.add("name");
		list.add(true);
		list.add(1.1);
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		System.out.println(list);
		
		System.out.println();
		System.out.println("----데이터 조회 ------");
		
		System.out.println("1번째 요소 : "+list.get(0));
		
		System.out.println("리스트의 크기 : "+list.size());
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i +" : "+ list.get(i));
		}
		
		System.out.println("--------------");
		
		for(Object item : list) {
			System.out.println(item);
		}
		
		
		System.out.println("---데이터 수정-------");
		
		list.set(0, "Orange");
		System.out.println(list);
		
		System.out.println();
		System.out.println("---데이터 삭제-------");
		
		list.remove(0);
		list.remove(1.1);
		System.out.println(list);
		
//		.remove(int index) 인덱스로 요소를 지정하여 삭제
//		.remover(Object o) 요소의 값을 비교 ( equals)하여 삭제
		
		list.remove(1); //1번째 인덱스 삭제
		System.out.println(list);
		
		list.remove("Apple");
		System.out.println(list);
		
		
		list.remove("Orenge");
		System.out.println(list);
		
//		-------------------------------------------------------
		
//		삽입, 조회, 수정, 삭제
		
//		데이터를 다룰 때 고려해야하는 기능들
		
//		CRUD
		
//		Create	-추가/삽입/생성
//		Read	-조회/탐색
//		Update	-수정/변경
//		Delete	-삭제/제거 
//		-------------------------------------------------------------
		
		System.out.println();
		System.out.println("-----isEmpty----");
		
//		리스트가 비어있는 지 확인
		System.out.println(list.isEmpty());
		
		
		ArrayList l1 = null;	//리스트 객체를 생성하지 않음
		ArrayList l2 = new ArrayList();	//리스트 객체를 생성함, 비어있음
		
		
		System.out.println("l1 : "+l1);
		System.out.println("l2 : "+l2);
		
//		//에러, nullPointException	
//		l1.isEmpty(); // . 을 사용하면 "참조" 하겠다는 뜻
		System.out.println(l1==null);
		System.out.println(l2.isEmpty());
		
		if(l2 != null) {
			if(!l2.isEmpty()) {
				System.out.println(l2.get(0));
			}
		}
		
		System.out.println("----clear -----");
		
		list.clear(); //모든 요소 제거
		System.out.println(list);
		
		System.out.println("---------");
		
		int[] arr = {1,2,3,4,5,6};
		
//		
		List list2 =Arrays.asList( 1,2,3,4,5,6);	
		System.out.println(list2);
		
		List list3 = Arrays.asList("Apple","Banana","Cherry");
		System.out.println(list3);
		
		
//		List -> Array 변환
		Object[] arr2 = list2.toArray();
		Object[] arr3 = list3.toArray();
	}

}
