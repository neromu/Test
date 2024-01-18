package java06_class.getset;

public class GetSetEx {

	public static void main(String[] args) {
		
		Data data = new Data(); //main 메소드 영역에서 실행. 
//		class GetSetEx가 주인
		
		
//		찾아 들어간 주체 GetSetEx
//		data.num =242141;
//		에러, 외부 객체의 접근이 막혀있
//		private 
		
//		Setter 호출을 통해 멤버필드에 값 저장
		data.setNum(252);
		data.setName("Bob");
		data.setPhone("010111111121");
		
//		Getter 호출을 통해 멤버필드의 값 불러오기
		System.out.println(data.getNum());
		System.out.println(data.getName());
		System.out.println(data.getPhone());
		
		
		
		
		
		
		
		
	}//main

}//class
