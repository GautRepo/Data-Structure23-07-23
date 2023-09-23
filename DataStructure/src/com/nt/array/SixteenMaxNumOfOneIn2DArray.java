package com.nt.array;

public class SixteenMaxNumOfOneIn2DArray {

	public static void main(String[] args) {
		int[][] ar = {{1,0,0,0},{0,1,1,0},{1,1,1,0},{0,1,0,0}};
		
		int rowSum=0;
		int rowNum=0;
		
		for(int i=0;i<ar.length ;i++) {
			int[] arr = ar[i];
			int count =0;
			for(int j=0 ; j<arr.length ;j++) {
				if(arr[j]==1) {
					count++;
				}
			}
			if(count>rowSum) {
				rowSum=count;
				rowNum=i;
			}
		}
		
		System.out.println(rowSum +" row sum " +rowNum +" Row Num");

	}

}
