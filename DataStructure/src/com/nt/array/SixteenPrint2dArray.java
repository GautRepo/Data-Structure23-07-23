package com.nt.array;

public class SixteenPrint2dArray {

	public static void main(String[] args) {
		int[][] ar = {
						{1,2,3},
						{2,3,4},
						{6,5,7}
					 };
		
		printArray(ar);
		System.out.println();
		printcolumnwise(ar);
		System.out.println();
		rowSum(ar);
		System.out.println();
		transpose(ar);
		printArray(ar);

	}

	private static void printcolumnwise(int[][] ar) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0; j<ar[i].length;j++) {
				System.out.print(ar[j][i] +" ");
			}
			System.out.println();
		}
		
	}

	private static void printArray(int[][] ar) {
		
		for(int i=0; i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j] +" ");
				
			}
			System.out.println();
		}
		
		
		
	}
	
	private static void rowSum(int[][] ar) {
		
		for(int i=0 ;i<ar.length;i++) {
			int sum =0;
			for(int j=0; j<ar[i].length;j++) {
				sum = sum + ar[i][j];
			}
			System.out.println(sum);
		}
	}
	
	private static void transpose(int[][] ar) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i;j<ar[i].length;j++) {
				int temp=ar[i][j];
				ar[i][j]=ar[j][i];
				ar[j][i]=temp;
			}
		}
	}
	

}
