package java07_inherit.practice.model;

public class Point {
//	--- Field ---
//	# x : int
//	# y : int
//
//	--- Constructor ---
//	+ Point()
//	+ Point(x : int, y : int)
//
//	--- Method ---
//	+ getter, setter 구현
//	+ draw():void	//x, y 좌표값 출력 ex) (3, 4)
	
//	멤버 필드
	protected int x;
	protected int y;
	
//	생성자
	public Point() {}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
//	멤버 메소드
	public void draw() {
		System.out.println("("+x+", "+y+")");
		
	}
	
	
	
	
//	Getter Setter
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	
}
