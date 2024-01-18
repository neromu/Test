package java05_Array.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		
//		3 > 2 5 4 1
//		swap 
//		2   3!>5 4 1
//		2   3 5 >4 1
//		2    3 4 5 >1
//		2   3  4 1 5   <=bubble sort의 1회 끝 반복...
// 				  |-> 정렬 완료
//		2!>3  4  1  5
//		2  3>!4  1  5
//		2  3  4 >1  5
//		2  3  1  4  5  <- 할 필요 x    2회 끝
//		        |-> 정렬 완료
//		2!>3  1  4  5
//		2  3 >1  4  5
//		2  1  3  4  5
//		     |-> 정렬 완료
//		2 >1  3  4  5
//		1  2  3  4  5 <- bubble sort 종료
//		비교 횟수 => 길이 -(회차)
//		ex) data :10 => 1회차:9번,  2회차:8번
//		----------------------------------------------------------------
//		버블 정렬
//		----------------------------------------------------------------
		
		int[] arr = {3,2,5,4,1};
//		원본 출력
		System.out.println("---정렬 전---");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
//		버블 정렬 수행
		
		int tmp =0;
		
		for(int i =0; i<(arr.length-1);i++) {
			for(int j=0; j<(arr.length-1-i); j++) {
//				if(arr[j]>arr[j+1]) { //오름차순
				if(arr[j]<arr[j+1]) { //내림차순
					tmp=arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = tmp;
				}//if
			}//inner for
		}//outer for

//		결과 출력
		System.out.println("---정렬 후---");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("-----------------------------------");
		
		int[] arr2 = {1531,3544531,4444,11315,879,1327,4612,6544,777};
		
		Arrays.sort(arr2);
		
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.print(arr2[i]+" ");
//		}
		
		System.out.println( Arrays.toString(arr2));

	}//main

}//class
