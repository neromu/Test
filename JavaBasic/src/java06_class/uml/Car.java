package java06_class.uml;

public class Car {
//	멤버 필드
	private String model;
	private String color;
	
//	생성자
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
	}

//	default 생성자
//	public Car() {}
	

	//	멤버 메소드
	public void display() {
		System.out.println("Model : "+model);
		System.out.println("color : "+color);
	}
	
	
	
	
//	Getter Setter
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
