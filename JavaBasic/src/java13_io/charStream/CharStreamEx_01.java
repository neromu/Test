package java13_io.charStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharStreamEx_01 {
	public static void main(String[] args) {
		
//		문자 스트림, Charcter Stream
//		문자(char, 2B) 단위로 통신하는 스트림
		
//		기본 스트림은 1B단위로 통신하는 바이트 스트림이다
//		바이트 스트림을 문자 스트림으로 변환해서 사용해야 한다
		
//		class InputStreamReader
//		바이트 입력스트림 --> 문자 입력스트림
//		InputStream -> Reader
		
//		In/OutputStream --> 바이트 스트림
//		Reader/ Writer --> 문자 스트림
		
//		class OutputStreamWriter
//		바이트 출력스트림 --> 문자 출력스트림
//		OutputStream -> Writer
		
//		--------------------------------------------------------
		
//		가장 기본적인 입출력 스트림
//		키보드 입력을 모니터 출력으로 전달하기
//		-> 문자스트림 이용
		
//		키보드, 모니터 바이트 스트림
//		InputStream in = System.in;
//		OutputStream out = System.out;
		
//		문자스트림 최상위 부모. (객체 생성시 매개변수는 바이트 스트림.)
		Reader reader = new InputStreamReader(System.in);
		Writer writer = new OutputStreamWriter(System.out);
		
//		바이트 스트림에서는 1B 통신이기에 byte 사용.
//		byte[] buf
		
//		스트림 보조 변수
		char[] cbuf = new char[1024];	//임시 저장소
		int len = -1;					//입력한 글자 수
		
		try {
			
//			입력할 데이터가 스트림에 남아있으면 반복해서 입력받는다
			while( (len = reader.read( cbuf ) ) != -1){
				
//				입력한 데이터 출력하기
				writer.write(cbuf,0,len);
				
//				버퍼 비우기
				writer.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			
			try {
			if(reader!=null)	reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
			if(writer!=null)	writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
