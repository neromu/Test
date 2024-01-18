package java11_generic;



//제네릭 클래스
class Class02<TYPE> {
//	raw type ->Object 
	private TYPE data;
	
	public TYPE display(TYPE data) {
		this.data = data;
		return data;
	}
	
	public TYPE getData() {
		return data;
	}

	public void setData(TYPE data) {
		this.data = data;
	}
	
	
	
}



class Class02_01<T> {
	
	private T data;
	
	public T display(T data) {
		this.data = data;
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	
	
}








public class Genetic_02_GenericClass {

	public static void main(String[] args) {
		
//		타입 파라미터를 결정하지 않음
//		->Object타입으로 자동 결정
//		-> raw type
		Class02 c01 = new Class02();
		
		
		c01.setData(12345);
		
//		반환타입 => Object
		int num = (int)c01.getData();
//		에러, 자식타입은 부모타입으로 받을 수 없다.
//		타입 안전성이 없다
//		--------------------------------------------
		
		Class02<String> c02 = new Class02<>();
		
		c02.setData("Grape");
		
		String fruit = c02.getData();
		
		System.out.println(fruit);
	}

}
