package java10_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection_04_Set {

	public static void main(String[] args) {
		
//		Set set = new HashSet(); //기본set
//		Set set = new LinkedHashSet(); //입력 순서 유지set
		Set set = new TreeSet(); //정렬set
		
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(40);
		
//		중복 데이터는 제거한다
		set.add(30);
		set.add(40);
		
		set.add(30);
		set.add(40);
		
		
		
		System.out.println(set);
		
		System.out.println("----------------");
		
//		Set객체의 Iterator 생성
		Iterator iter = set.iterator();
		
//		Iterator를 통한 전체 데이터 출력
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("----------------");
		
		for(Object data: set) {
			System.out.println(data);
		}
		
		System.out.println("----------------");
		
		System.out.println("크기? "+set.size());
		System.out.println("비었는지? "+set.isEmpty());
		System.out.println("30 이 존재하는지? "+set.contains(30));
		System.out.println("30 제거 : "+set.remove(30));
		System.out.println("50 제거 : "+set.remove(50));
		
		
		System.out.println("----------------");
		
		System.out.println(set);
		
		System.out.println("--------clear--------");
		set.clear();
		System.out.println(set);
		
	}

}
