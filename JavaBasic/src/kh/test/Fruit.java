package kh.test;

public class Fruit {
	public String fruit;
	public String color;
	public String getFruit() {
		return fruit;
	}
	public void setFruit(String fruit) {
		this.fruit = fruit;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
		
	public Fruit(String fruit, String color) {
		this.fruit = fruit;
		this.color = color;
	}
	public Fruit(String fruit) {
		this.fruit = fruit;
	}
	@Override
	public String toString() {
		return "Fruit [fruit=" + fruit + ", color=" + color + "]";
	}
	
	
}
