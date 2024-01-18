package java06_class.uml.manage2;

import java.util.Scanner;

public class StudentEx_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0,count=0;
		StudentService_02 ss02 = new StudentService_02();
		do {

			ss02.menu();
			num = sc.nextInt();
			
			if(num <7 && num >3) {
				ss02.print(num-4);
			}else if(num <4 && num >0) {
				if(count!=0) {
					ss02.newlineD();
				}
				ss02.nameAgeGrade(num-1);
			}else if(num ==7) {
				ss02.printall();
			}
		count++;
		}while(num != 8);
		
		
		
		
		
		
		
		
	}//main
}//class
