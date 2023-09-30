package com.nt.array;

public class Rotate2DArrayWith90Degree20 {

	public static void main(String[] args) {
		
		int[][] ar = {	{1,2,3},
						{4,5,6},
						{7,8,9}
					 };

		transposeArray(ar);
		printArray(ar);
		System.out.println();
		reverseRow(ar);
		printArray(ar);
	}

	private static void transposeArray(int[][] ar) {
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i;j<ar[i].length;j++) {
				int temp = ar[i][j];
				ar[i][j]=ar[j][i];
				ar[j][i]=temp;
			}
		}
		
	}
	
	private static void printArray(int[][] ar) {
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	private static void reverseRow(int[][] ar) {
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				int s=0;
				int e= ar[i].length-1;
				int temp=ar[i][s];
				ar[i][s]=ar[i][e];
				ar[i][e]=temp;
				
			}
		}
	}

}
