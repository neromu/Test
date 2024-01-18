package java09_api;

import java.util.Objects;

public class Point implements Cloneable {
//						클론을 허가한다. ~~able
	private int x;
	private int y;
	
	public Point(int x, int y) {
//		super();	//Object의 생성자 호출. 자동으로 호출되니 지워도 상관x
		this.x = x;
		this.y = y;
	}

	
//	-------------------------------------------------------------
//	to String alt + shift + s , s  자동생성
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
//				클래스    필드     필드
	}


	


	
//	@Override
//	public String toString() { //주로 sysout에서 사용함. => 콘솔 출력 => 디버깅,테스트 에서 자주 사용
////								=> 사용자 입장에서 안 본다.
////		return super.toString();
//		return "("+x+", "+y+")";
//	}
	
//	-------------------------------------------------------------
	
//	@Override
//	public boolean equals(Object obj) {
////		기존 코드 : 동일성 비교
////		return super.equals(obj);
//		
////		p2.equals(p3); 를 호출했을 경우
////		기준 : p2객체   매개변수 : obj
////		->p2객체를 통해 메소드를 호출했다
//		
////		->전달인자는 p3객체
//		
////		-> this == p2
////		-> obj == p3
//		
//		if( this.x == ((Point)obj).x && this.y == ((Point)obj).y ) {//null point exception 발생 가능성이 있다
//			return true;//동등하다
//		}
//		
//		return false;//동등하지 않다
//		
//	}
	
	
//	Arrays
//	Objects => 객체에 관련된 내용을 넣은 유틸 클래스
//	Override x 시 동일비교.
//	 동등한 클래스 객체들은 동등한 해시코드를 가지게 된다. Override 사용시.
	@Override
	public int hashCode() {
		return Objects.hash(x, y); 
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}


//	throws 문제 발생할 수 있는 
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
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
