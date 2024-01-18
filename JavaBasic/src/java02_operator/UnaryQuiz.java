package java02_operator;

public class UnaryQuiz {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int a = 5, b = 6, c = 10, d;
		
		d = ++a * b--; // d=6*6=36 -> a=6, b=5, c=10
		
		System.out.println("a=" + a + ", b=" + b + ", d=" + d); // a=6, b=5, c=10, d=36
		
		
		//a=6, b=5, c=10, d=36
		d = a++ + ++c - b--; // d=6+11-5=12 -> a=7, b=4, c=11
		
		System.out.println("a=" + a + ", b=" + b + ", c=" + c + ", d=" + d); // a=7 b=4 c=11 d=12
		
		System.out.println("-----------------------------------------------------");
		
	    //--------------------------------------------------------------------------------------------------------
		
		int e = 5, f = 6, g = 10;

	    boolean res1;
	    res1 =  e < f || --e > g++;         // e=5, f=6
	    //     e=5 < f=6
	    //       true
	    // -> OR 연산자는 하나만 true 이면 바로 true로 출력, 이후 연산 안함
	    System.out.println("e=" + e + ", f=" + f + ", g=" + g); // e=5 f=6 g=10
	      
	    boolean res2;
	    res2 = g<f++ && g-->++e;            // e=5, f=7, g=10
	    //    10<6
	    //    false
	    // -> AND 연산자는 하나만 false 이면 바로 false로 출력, 이후 연산 안함
	    System.out.println("e=" + e + ", f=" + f + ", g=" + g);  // e=5 f=7 g=10
	    
	    //--------------------------------------------------------------------------------------------------------
	    
	    // 논리 연산의 단축 수행
	    // AND 연산은 왼쪽 피연산자가 false라면 오른쪽 항 연산을 수행하지 않음
	    // OR 연산은 왼쪽 피연산자가 true라면 오른쪽 항 연산을 수행하지 않음
		
	}

}