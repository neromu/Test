package java10_collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Collection_05_Convert {

	public static void main(String[] args) {
		
		List list = Arrays.asList("Apple", "Banana","Cherry","Banana","Cherry");
		
		System.out.println(list);
		
		System.out.println("-----------------");
		
		Set set = new HashSet(list);
		
		System.out.println(set);
		
		System.out.println("----------comparator-------");
		
		List list2 = new LinkedList(set);
		
		System.out.println(list2);
		
		list2.sort(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((String)o1).compareTo(((String)o2));
			}
		});
		System.out.println(list2);
	}	}
		