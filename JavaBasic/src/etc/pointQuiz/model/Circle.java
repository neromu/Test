package etc.pointQuiz.model;

public class Circle extends Point {
//	멤버 필드
	private int radius;
	
//	생성자
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		this.draw();
	}
//	메소드
	@Override
	public void draw() {
		System.out.print("중심점 좌표: ");
		super.draw();
		double pi = Math.PI;
		System.out.println("반지름 : " +radius);
		System.out.printf("원의 면적 : %.1f",(pi*radius*radius));
		System.out.println();
		System.out.printf("원의 둘레 : %.1f",(pi*radius*2));
		System.out.println();
		
	}

	
	
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
}
