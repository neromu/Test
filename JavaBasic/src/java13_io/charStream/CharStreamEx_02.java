package java13_io.charStream;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class CharStreamEx_02 {
	public static void main(String[] args) {
//		.readLine() <- 문자열 한줄(개행문자 포함)을 읽어들임.
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		
//		PrintWriter out = new PrintWriter( new BufferedWriter( new OutputStreamWriter( System.out ) ) );
//		BufferedWriter 도 사용할만 하나, PrintWriter의 성능이 더 좋음.
//		.printlin() .print() 메소드를 가지고 있음.
//		아래 방식으로 객체 생성 코드를 한줄 줄일 수 있다.						autoFlush
		PrintWriter out = new PrintWriter( new BufferedOutputStream( System.out ), true );
		
//		** PrintWriter의 생성자에 두 번째 인자로 true를 설정하면
//		AutoFlush 모드가 활성화된다
//		-> print(), println() 메소드로 출력하면 자동 .flush()한다
		
//		-> .write() 메소드는 autoFlush하지 않는다
		
//		--------------------------------------------------------------
		
//		in.readLine() : String
//		-> 입력 스트림에서 문자열 한 줄('\n' 까지)을 입력받아 반환한다
		
//		out.print() : void
//		out.println() : void
//		-> 다양한 자료형을 편하게 출력할 수 있다
		
//		--------------------------------------------------------------
		
		String str = null;
		
		try {
			
//			입력 스트림에 입력받을 문자열이 있으면 반속
			while( ( str =in.readLine() ) != null ) {
//				입력된 문자열 출력
				out.println( str );
//				**autoFlush 모드로 설정했기 때문에 .flush() 필요없음
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
			if(in!=null)	in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(out!=null)	out.close();
//			PrintWriter은 .close() 메소드 내에 try ~ catch가 존재.
		}
		
		
//		스캐너도 .close() 메소드 내에 try ~ catch 존재.
//		new Scanner(System.in).close;
	}

}
