package java12_Exception_custom;

public class User {
//	나이
	private int age;

	
	
	
	
//	Getter Setter
	public int getAge() {
		return age;
	}

	public void setAge(int age)  throws UserAgeException{
		
//		예외 상황으로 정의
		if(age<0 || age>150) {
//			System.out.println("나이는 0~150사이로 입력하세요");
//			return;
			
			throw new UserAgeException();
			
		}
		
		this.age = age;
	}
}
