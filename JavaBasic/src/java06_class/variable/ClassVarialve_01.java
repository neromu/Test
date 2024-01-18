package java06_class.variable;

public class ClassVarialve_01 {
	
//	멤버 필드
	private int num =999;
	private String name;
	
//	디폴트 생성자
	public ClassVarialve_01() {}
	public ClassVarialve_01(int num) {
		this.num=num;
	}
	public ClassVarialve_01(String name) {
		this.name = name;
	}

	
	
	
	
	
	
	
//	멤버 메소드
	public void out() {
		System.out.println("num : "+num+", name :"+name);
	}
	
	
	
	
	
	
	
//	멤버 메소드 -> Getter Setter
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}//class
