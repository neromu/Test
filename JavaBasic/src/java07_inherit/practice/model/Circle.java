package java07_inherit.practice.model;
// 자식1
public class Circle extends Point {
//	--- Field ---
//	- radius : int
//
//	--- Constructor ---
//	+ Circle()
//	+ Circle(x:int, y:int, radius:int)
//		//x, y는 부모생성자로 넘김
//		//center point(중심점)로 취급
//
//	--- Method ---
//	+ Getter, Setter 구현
//	+ draw() : void //원의 x, y좌표, 면적과 둘레 계산 출력함
//			java.lang.Math.PI 사용함
//	* 원면적 = PI * radius * radius;
//	* 원둘레 = 2 * PI * radius;
//	* 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것
	
//	멤버 필드
	private int radius;
	
//	생성자
	public Circle() {}

	public Circle(int x , int y, int radius) {
//		super.x = x;
//		super.y = y;
		super(x,y);
		this.radius = radius;
//		this.draw();
	}
	
//	메소드
	@Override
	public void draw() {
//		System.out.println("------Circle 시작 ------");
//		System.out.println("x : "+super.x);
//		System.out.println("y : "+super.y);
		System.out.print("중심점 : ");
		super.draw();
		double pi = Math.PI; 
		System.out.printf("원의 면적 : %.1f", (pi*radius*radius));
		System.out.println();
		System.out.printf("원의 둘레 : %.1f", 2*pi*radius );
		System.out.println();
//		System.out.println("------Circle 끝------");
		System.out.println("---------------------");
	}

	
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
}
