package com.nt.array;

public class FiveReverseArray {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7};
		
		reverseArray(ar);
		
		for(int a : ar) {
			System.out.print(a+" ");
		}

	}
	
	public static void reverseArray(int[] ar) {
	
		int start =0;
		int end =ar.length-1;
		
		while(start<end) {
			int temp = ar[start] ;
			ar[start]= ar[end];
			ar[end] = temp;
			start++;
			end--;
		}
	}

}
