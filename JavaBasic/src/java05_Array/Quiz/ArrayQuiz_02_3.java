package java05_Array.Quiz;

public class ArrayQuiz_02_3 {

	public static void main(String[] args) {
		int[] arr = {10,17,3,9,27,10,8,9,13,21};
		
		int[] rank_arr = new int[arr.length];
		int a=0 ,temp=0 ,i,j,k;
		
//		for(i=0; i<arr.length;i++) {
//			rank_arr[i] = arr[i];
//		}
//		
//		for(i=0; i<arr.length;i++) {
//			for(j=0;j<(arr.length-1-i);j++) {
//				if( rank_arr[j] < rank_arr[j+1] ) {
//					temp = rank_arr[j];
//					rank_arr[j] = rank_arr[j+1];
//					rank_arr[j+1]=temp;
//				}
//			}
//		}
		for(i=0; i<arr.length;i++) {
			rank_arr[i]++;
		}
		for(i=0; i<arr.length;i++) {
			for(j=0; j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					rank_arr[j]++;
				}
			}
		}
		
		
		
		System.out.println("arr:");
		for (i = 0; i < rank_arr.length; i++) {
			System.out.print(arr[i]+"\t ");
		}
		System.out.println();
		System.out.println("rank:");
		for (i = 0; i < rank_arr.length; i++) {
			System.out.print(rank_arr[i]+"\t ");
		}
		System.out.println();
		
		
		
		
	}//main

}//class
