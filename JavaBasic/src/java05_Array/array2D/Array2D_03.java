package java05_Array.array2D;

public class Array2D_03 {
	public static void main(String[] args) {
		
		//int형 2차원 배열 변수 선언
		int[][] arr;
		
		arr = new int[3][];
	
		System.out.println( arr );
		System.out.println( arr[0] );
		System.out.println( arr[1] );
		System.out.println( arr[2] );
		
		//----------------------------------------------------------
		
		arr[0] = new int[5]; // 0행 배열 생성
		arr[1] = new int[3]; // 1행 배열 생성
		arr[2] = new int[7]; // 2행 배열 생성
		
		//-----------------------------------------------------------
		
		System.out.println( arr.length );		// 전체 행의 길이
		
		System.out.println( arr[0].length );	// 0행의 열 길이
		System.out.println( arr[1].length );	// 1행의 열 길이
		System.out.println( arr[2].length );	// 2행의 열 길이
		
		System.out.println("----------");
		
		// arr 배열의 행과 열을 이용하여 모두 출력!
		
		for(int i=0; i<arr.length; i++) { // i 행, 0 ~ arr.length-1
			for(int j=0; j<arr[i].length; j++) { // j 열, 0 ~ arr[i].length-1
				System.out.print( arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}














