package java08_abstract;

public class Student extends Person{
//	멤버 필드
//	수강 과목	
	private String subject;
	
	
	public Student(String name, String subject) {
		super(name);
		this.subject = subject;
	}
	
	@Override
	public void display() {
		System.out.println("[학생] "+name+", "+subject+" 수강");
	}
	
	
}
