package java07_inherit.practice2.product;

public class Product {
//public abstract class Product {
//	멤버 필드
	protected String model;
	protected int price;

//	생성자
	public Product() {
		
	}
	
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
//	메소드
	public void out() {
		System.out.println("부모 클래스 메소드");
		System.out.println("Model : "+model);
		System.out.println("Price : "+price);
	}

//	public abstract void out();
	
	
//	Getter Setter
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}//Product class
