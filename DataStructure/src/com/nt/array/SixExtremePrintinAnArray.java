package com.nt.array;

public class SixExtremePrintinAnArray {

	public static void main(String[] args) {
		int[] arr= {7,6,5,4,3,2,1};
		
		extremePrint(arr);
		

	}

	private static void extremePrint(int[] arr) {
		int start= 0;
		int end = arr.length-1;
		
		while(start<=end) {
			if(start==end) {
				System.out.print(arr[start]);
			}else
				System.out.print(arr[start] +" " +arr[end]+" ");
			
			start++;
			end--;
		}
		
		
	}

}
