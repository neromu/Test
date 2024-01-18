package java06_class.overloading;

public class Overloading {
	
//	멤버 필드
	private int x;
	private int y;
	
//	생성자
	
	
	
//	멤버 메소드
//	멤버필드 x, y 를 콘솔에 출력하는 기능
	public void display() {
		System.out.println("x : "+x+ ", y : "+y);
//		System.out.println("x : "+getX()+ ", y : "+getY());
	}
//	멤버필드 x, y에 값을 저장하고, 콘솔에 출력하는 기능
	public void display(int x, int y) { //입력 값.
//		this.x =x;
//		this.y =y;
//		System.out.println("( "+x+", "+y+" )");
		
		setX(x);
		setY(y);
		display();
	}
	
//	오버로딩 테스트 메소드
	public void display(int num) {}
//	에러, 31라인 충돌, 매개변수 이름이 달라도 자료형이 같아서 오버로딩x
//	public void display(int data) {}
	
	public void display(double num) {}
	public void display(String data) {}
	public void display(String data, int num) {}
	public void display(int num, String data) {}
	
//	에러, 35라인 충돌, 접근제한자가 달라도 오버로딩x
//	private void display(double value) {}
	
//	에러, 15라인 충돌, 리턴타입이 달라도 오버로딩x
//	public int display() {
//		return 0;
//	}
	

	public void sum() {
		System.out.println("x + y = "+(x+y));
	}
	
//	toString , equals 등 공통 메소드
	

//	Getter , Setter
//	단축기 : alt + shift + s, r , alt + a , alt + r
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
}//class
