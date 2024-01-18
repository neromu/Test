package java07_inherit.practice2.person;

import java07_inherit.practice2.product.Product;

public class Person {
//	멤버 필드
	private String name;
	private int money;
	
	private Product prod;
//	여러개 저장하려면 array 또는 list 사용해야함.
	
//	생성자
	public Person() {}

	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
//	메소드
	public void buy(Product prod) {
		System.out.println("Person 메소드");
		this.prod = prod;
		
//		if( money-prod.getPrice() >= 0) {
////		this.money = money - prod.getPrice();
//			this.money -= prod.getPrice();
//			System.out.print(name+"님이 "+prod.getPrice()+"원을 지불하고");
//			System.out.println(prod.getModel()+" 구매함");
//			System.out.println("[ 잔액 ] "+this.money);
//		
//		}else if(money-prod.getPrice() <0) {
//			System.out.println("잔액이 부족해 " +prod.getModel()+"을(를) 구매하지 못하였습니다");
//		
//		}
		if(this.money < prod.getPrice()) {
			System.out.println("[SYSTEM] 잔액이 부족합니다");
			System.out.println("[ 잔액 ] "+this.money+"원");
			return; //메소드 중단 
//		문제 발생시 멈춰라.
		}
			this.money -= prod.getPrice();
			System.out.print(name+"님이 "+prod.getPrice()+"원을 지불하고 ");
			System.out.println(prod.getModel()+" 구매함");
			System.out.println("[ 잔액 ] "+this.money);
			System.out.println();
	}
	
	
//	Getter Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	
	
	
	
}//Person class
