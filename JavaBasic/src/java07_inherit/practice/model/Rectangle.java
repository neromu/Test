package java07_inherit.practice.model;
// 자식2
public class Rectangle extends Point{
//	--- Field ---
//	- width : int 	//가로너비
//	- height : int 	//세로높이
//			//부모의 x, y는 사각형 좌측상단의 좌표값으로 처리
//
//	--- Constructor ---
//	+ Rectangle()
//	+ Rectangle(x:int, y:int, width:int, height:int)
//		//x, y는 부모 생성자로 넘김
//
//	--- Method ---
//	+ getter, setter 구현
//	+ draw() : void	//사각형의 x, y좌표, 면적, 둘레 계산 출력 처리
//	* 면적 : 가로 * 세로
//	* 둘레 : 2 * (가로 + 세로)
//	* 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것
	
//	멤버 필드
	private int width;
	private int height;
//	부모의 x, y는 사각형 좌측상단의 좌표값으로 처리
	
//	생성자
	public Rectangle() {
		for (int i = 0; i < 3; i++) {
			
		}
	}

	public Rectangle(int x, int y, int width, int height) {
//		super.x =x;
//		super.y =y;
		super(x,y);
		this.width = width;
		this.height = height;
		
	}
	
//	메소드
	@Override
	public void draw() {
//사각형의 x, y좌표, 면적, 둘레 계산 출력 처리
//		System.out.println("------Rectangle 시작 ------");
		
//		System.out.println("x : "+super.x);
//		System.out.println("y : "+super.y);
		System.out.print("중심점 : ");
		super.draw();
		System.out.printf("면적 :  %.1f", (width*(double)height) );
		System.out.println();
		System.out.printf("둘레 : %.1f", 2*(width+(double)height));
		System.out.println();
//		System.out.println("------Rectangle 끝 ------");
		System.out.println("---------------------");

		
	
//	* 면적 : 가로 * 세로
//	* 둘레 : 2 * (가로 + 세로)
//	* 면적과 둘레는 모두 반올림하여 소숫점 아래 첫째자리까지 처리할 것
	}
	
	
	
	
	
	
	
//	Getter Setter
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
}
