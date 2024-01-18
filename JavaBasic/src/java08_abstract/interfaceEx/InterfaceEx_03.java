package java08_abstract.interfaceEx;

interface InterA {
	
	public abstract void getA();
	
	
	
}

interface InterB {
	
	public abstract void getB();
	
}

interface InterC extends InterA, InterB{
	public abstract void getC();
}
//	**클래스가 클래스를 상속받을 때 extends
//	**인터페이스가 인터페이스를 상속받을 때 extends

//	**클래스가 인터페이스를 상속받을 때 implements

//class Child implements InterA,InterB,InterC{
class Child implements InterC{
	
	@Override
	public void getC() {}

	@Override
	public void getB() {}

	@Override
	public void getA() {}
	
	
	
	
}





public interface InterfaceEx_03 {
		
	
	
	
	
		
		
		
}
