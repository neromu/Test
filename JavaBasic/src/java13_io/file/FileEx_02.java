package java13_io.file;

import java.io.File;

public class FileEx_02 {

	public static void main(String[] args) {
		
//		절대 경로 지정 - Absolute Path	경로								파일명
		File file1 = new File("D:/workspace/JavaBasic/src/java13_io/file/", "Hello");
//					win=>	D:/ 로 시작하면 절대 경로로 지정했다고 함
//							Linux, Unix, MacOS ==> / root Directory 라고함
		
		
//		잘못된 방식				파일명	경로
		File file2 = new File( "Hello", "D:/workspace/JavaBasic/src/java13_io/file/");
		
//								경로 + 파일명
		File file3 = new File("D:/workspace/JavaBasic/src/java13_io/file/Hello");
//							              상대적 기준|
		
		System.out.println(file1);
		System.out.println(file1.exists());
		System.out.println(file1.length());
		System.out.println("--------------------------");

		System.out.println(file2);
		System.out.println(file2.exists());
		System.out.println(file2.length());
		System.out.println("--------------------------");
		System.out.println(file3);
		System.out.println(file3.exists());
		System.out.println(file3.length());
		
		
		System.out.println("--------------------------");
		System.out.println();
//		-----------------------------------------------------------------
		
//		상대 경로 지정
		
		File file4 = new File("src/java13_io/file/", "Hello");
		
		
		System.out.println(file4);
		System.out.println(file4.exists());
		System.out.println(file4.length());
		
//		절대 경로 확인
		System.out.println(file4.getAbsolutePath());
		
//		상대 경로 기준점 == 클래스 패스 == 프로젝트 폴더
//		D:\workspace\JavaBasic\
		
		
		System.out.println("--------------------------");
		System.out.println();
		
//		File file5 = new File("./src/java13_io/file/../../java10_collection", "user.properties");
////		==File file5 = new File("./src/", "");
//		System.out.println(file5.exists());
		
//		File file5 = new File("/workspace/JavaBasic/src/java13_io/file/", "Hello");
//		File file5 = new File("../JavaBasic/src/java13_io/file/", "Hello");
		File file5 = new File("D:/workspace/JavaBasic/../JavaBasic/src/java13_io/file/", "Hello");
		
		
		System.out.println("Hello : "+file5.isFile());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
