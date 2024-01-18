package java10_collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Collection_02_List {

	public static void main(String[] args) {
		
//		리스트 특성 : 인덱스와 순서유지
//		내부 처리의 차이가 존재.
		List list = new ArrayList();
//		List list = new LinkedList();
//		List list = new Vector();
//		
		
		list.add(30);
		list.add(20);
		list.add(10);
		
		System.out.println(list);
		
	}

}
