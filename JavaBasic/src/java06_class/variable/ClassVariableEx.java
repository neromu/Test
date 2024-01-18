package java06_class.variable;

public class ClassVariableEx {
//	JVM이 ClassVariableEx.main() 호출.
//	JVM 내부 실행기 존재. (JVM은 외부에서 접근하는 개념)
	public static void main(String[] args) {
		
		ClassVarialve_01 cv01;
		cv01 = new ClassVarialve_01();
		
		ClassVarialve_01 cv02= new ClassVarialve_01();
		ClassVarialve_01 cv03 = null;
		
		cv01.setNum(123);
		cv01.out();
		
		cv02.out();
		
//		예외 발생, NullPointerException
//		cv03.out();
		
		ClassVariable_02 cv04 = new ClassVariable_02();
		ClassVariable_02 cv05 = new ClassVariable_02();
		
		System.out.println(cv04.city);
		System.out.println(cv05.city);
		
		cv04.city = "Busan";
		
		System.out.println("-------");
		
		System.out.println(cv04.city);
		System.out.println(cv05.city);
		
		
		
		ClassVariable_02.city = "Incheon";
		System.out.println(ClassVariable_02.city);
//		**정적변수는 클래스 단위로 관리되기 때문에
//		정적인 방법 (static  way)으로 사용해야 한다
		
		System.out.println("---cv3----");

		ClassVariable_03 cv06 = new ClassVariable_03();
		
		cv06.method(0, 0);
		
		new ClassVariable_03().method(2, 3);
//		만들어서 곧바로 참조
		
//		new ClassVariable_03().
		
	}//main
	
}//class
