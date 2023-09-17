package com.nt.test;

public class SevenFindUniquenum {

	public static void main(String[] args) {
		
		int[] arr = {1,2,1,2,3,5,4,5,3};
		
		System.out.println(findUniqueNum(arr));

	}
	
	
	public static int findUniqueNum(int[] arr) {
		int num =0;
		
		for(int i=0;i<arr.length;i++) {
			num = num ^arr[i];
		}
		
		return num;
	}

}
