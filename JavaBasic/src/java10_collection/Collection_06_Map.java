package java10_collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection_06_Map {

	public static void main(String[] args) {
		
//		맵 객체 생성
//		Map map = new HashMap();
		Map map = new Hashtable();
		
//		데이터 삽입
		System.out.println("-----put(key,value)------");
//									obj obj 타입 가능
		map.put("a", "Apple");
		map.put(200, "Banana");
		map.put(true, 3.124512);
		
		System.out.println(map);
//		{} 안에서 각각의 쌍(Entry)를 , 로 구분해줌
		
		
//		데이터 조회
		System.out.println("-----get(key)------");
		
//		꺼낼 때는 key를 기준으로
		System.out.println(map.get("a"));
		System.out.println(map.get(200));
		System.out.println(map.get(true));
		
		System.out.println();
		System.out.println("-----중복된 키-----");
		
//		기존에 존재하는 매핑된 value를 변경한다
		map.put(true, "Durian");
		
		System.out.println(map);
		
		System.out.println();
		System.out.println("----중복된 값----");
		
		
//		중복된 value는 상관없이 삽입된다
		map.put(500, "Apple");
		System.out.println(map);
		
		System.out.println();
		System.out.println("----contains------");
		
		System.out.println("Key 5 :"+map.containsKey(5)); //false
		
//		존재하지 않는 key를 이용하여 .get() 호출 시 null 반환
		System.out.println("get(5) : "+map.get(5));
		
		
		System.out.println("Value \"Apple\" : " +map.containsValue("Apple"));
		
		System.out.println();
		System.out.println("----size------");
		System.out.println("크기 : "+map.size());
		
		
		System.out.println();
		System.out.println("----isempty------");
		System.out.println("비었는가? : "+map.isEmpty());
		
		
		System.out.println();
		System.out.println("----remove------");
		
//		ket를 찾아서 Entry를 삭제한다
		map.remove("a");
		System.out.println(map);
		
		
//		key를 찾아서 value가 같을 때 Entry를 삭제한다
		map.remove(true,"Orange");
		System.out.println(map);
		
		
		map.remove("a","Apple");
		System.out.println(map);
		
		System.out.println("----null데이터 처리------");
//		조심해야 할 것
		
//		HashMap은 key, value가 null인 상황은 에러는 아니지만 추천하지 않는다.
//		Hashtable은 key, value로 null값을 허용하지 않는다
//		map.put(null, "Bob");
//		map.put(900, null);
//		map은 Object 타입으로 받기에. null을 하나의 문자로 인정해줌
//		but null은 없다 라는 뜻이므로 지양해야함.
		System.out.println(map);
		
		
		System.out.println();
		System.out.println("----map <-> set------");
		
		Set keySet = map.keySet(); //key를 추출하여 Set으로 반환
		
		Set entrySet = map.entrySet(); //entry를 추출하여 Set으로 반환
		
		System.out.println("keySet : "+keySet);
		System.out.println("entrySet : "+entrySet);
		
		System.out.println("--------------");
		
		
//		iterator 하고 싶다면.
		Iterator keyIter = keySet.iterator();
		
		while(keyIter.hasNext()) {
			Object data = map.get(keyIter.next());
			
			System.out.println(data);
		}
		
	}//main

}//class
