package java07_inherit.practice2.product;

public class Computer extends Product{
//	멤버 필드
//	public String model;
//	public int price;
	
////	생성자
//	public Computer(String model, int price) {
//		super();
//		this.model = model;
//		this.price = price;
//	}
//	강의 방식
	public Computer(String model, int price) {
		super(model,price);
	}
	
//	메소드
	@Override
	public void out() {
//		System.out.println("model : "+ model);
//		System.out.println("price : "+price);
		System.out.println("컴퓨터");
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
//	public void setPrice(int num) {
//		this.price = price;
//	}
//	
//	
	
}
