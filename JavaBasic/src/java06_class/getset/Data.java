package java06_class.getset;

public class Data {
	
//	멤버 필드는 private가 일반적
	private int num;	//번호
	private String name;//이름
	private String phone;//전화번호
//	전화번호는 String로 해야함
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
//	Setter 메소드
//	->외부 객체에서 호출을 통해 멤버 필드의 값을 대입(저장)할 수 있다.
//	public void setNum(int num) {
//		this.num=num;
//	}
//
//
//	
////	Getter 메소드
////	->외부 객체에서 호출을 통해 멤버 필드의 값을 반환(불러오기)할 수 있다
//	public int getNum() {
//		return num;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setPhone(String phone) {
//		this.phone = phone;
//	}
//	
//	public String getPhone() {
//		return phone;
//	}
	
}
