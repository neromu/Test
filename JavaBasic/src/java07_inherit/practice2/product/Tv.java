package java07_inherit.practice2.product;

public class Tv extends Product{
//	멤버필드
//	private String model;
//	private int price;
	
//	생성자
	public Tv() {
		
	}

//	public Tv(String model, int price) {
//		this.model = model;
//		this.price = price;
//	
//	}
//	강의 방식
	public Tv(String model, int price) {
		super(model,price);
		
	}
	
//	메소드
	@Override
	public void out() {
		System.out.println("TV 메소드");
		super.out();
	}
	
	
	
	
	
//	Getter Setter 부모 클래스에 존재. 필요x
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}

}//Tv class
