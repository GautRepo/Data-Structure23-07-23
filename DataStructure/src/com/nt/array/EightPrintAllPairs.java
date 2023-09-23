package com.nt.array;

public class EightPrintAllPairs {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		
		printAllPairs(arr);

	}
	
	public static void printAllPairs(int[] arr) {
		
		for(int i=0 ;i<arr.length ;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.println(arr[i]+","+arr[j]);
			}
		}
	}

}
