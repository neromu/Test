package etc.pointQuiz.model;

public class Rectangle extends Point {
//	멤버 필드
	private int width;
	private int height;
//	생성자
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
		this.draw();
	}
//	메소드
	@Override
	public void draw() {
		System.out.print("x, y 좌표 : ");
		super.draw();
		System.out.println("폭 : "+width);
		System.out.println("높이 : "+height);
		System.out.println("사각형의 면적 : "+width*height);
		System.out.println("사각형의 둘레 : "+(2*(width+height)));
		
	}
	
	
	
	
}
