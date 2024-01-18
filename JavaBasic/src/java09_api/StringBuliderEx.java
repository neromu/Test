package java09_api;

public class StringBuliderEx {

	public static void main(String[] args) {
		
//		StringBuilder sb;
		StringBuffer sb;
		
//		StringBulider타입    String타입
//		에러, String처럼 사용할 수 없다
//		sb = "Apple";
		
//		객체 생성
//		sb = new StringBuilder();
		sb = new StringBuffer();
		
		System.out.println("length : "+sb.length());	//길이
		System.out.println("capacity : "+sb.capacity());//용량
		
		System.out.println("----Apple 추가-----");
		
		sb.append("Apple");
		
		sb.append(123);
		sb.append(true);
		
		System.out.println(sb);
		
		System.out.println("length : "+sb.length());	//길이
		System.out.println("capacity : "+sb.capacity());//용량
		
		System.out.println("------------------------------------");
		
		sb.append("BananaBanana");
		
		System.out.println(sb);
		System.out.println("length : "+sb.length());	//길이
		System.out.println("capacity : "+sb.capacity());//용량
		
		
		System.out.println("------------------------------------");
//		capacity를 length에 맞춘다
		sb.trimToSize(); 
		sb.delete(9, 24);
		
		System.out.println("length : "+sb.length());	//길이
		System.out.println("capacity : "+sb.capacity());//용량
		
		System.out.println("------------------------------------");
		sb.append("1");
		
		System.out.println("length : "+sb.length());	//길이
		System.out.println("capacity : "+sb.capacity());//용량
		
	}

}
