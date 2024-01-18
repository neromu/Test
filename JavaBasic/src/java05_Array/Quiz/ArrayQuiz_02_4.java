package java05_Array.Quiz;

public class ArrayQuiz_02_4 {

	public static void main(String[] args) {
		
		int[] arr = {10, 17, 3, 9, 27, 10, 8, 9, 13, 21};
		int[] over_arr,ret_arr;
		ret_arr = new int[10];
		over_arr = new int[10];
		int a=0,overlap=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					a++;
					if(a==2) {
						overlap++;
						a=0;
					}
				}
			}
			if(overlap==1) {
				over_arr[i] = arr[i];
				overlap=0;
				a=0;
			}else {
				ret_arr[i] = arr[i];
				a=0;
			}
		}
		for(int i =0; i<(ret_arr.length-1);i++) {
			for(int j=0; j<(ret_arr.length-1-i); j++) {
				if(ret_arr[j]<ret_arr[j+1]) {
					a=ret_arr[j+1];
					ret_arr[j+1] = ret_arr[j];
					ret_arr[j] = a;
				}//if
			}//inner for
		}//outer for
		for(int i =0; i<(over_arr.length-1);i++) {
			for(int j=0; j<(over_arr.length-1-i); j++) {
				if(over_arr[j]<over_arr[j+1]) { 
					a=over_arr[j+1];
					over_arr[j+1] = over_arr[j];
					over_arr[j] = a;
				}//if
			}//inner for
		}//outer for
		
		for (int i = 0; i < ret_arr.length; i++) {
			System.out.print(ret_arr[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < over_arr.length; i++) {
			System.out.print(over_arr[i]+" ");
		}
		System.out.println();
		

		
	}//main

}//class
