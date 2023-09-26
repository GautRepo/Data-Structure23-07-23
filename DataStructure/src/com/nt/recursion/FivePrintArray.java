package com.nt.recursion;

public class FivePrintArray {

	public static void main(String[] args) {
		int[] ar = {2,4,5,67,6};
		int i=0;
		printArr(ar,i);

	}

	private static void printArr(int[] ar, int i) {
		
		if(i==ar.length) {
			return;
		}
		System.out.println(ar[i]);
		
		printArr(ar,i+1);
	}

}
