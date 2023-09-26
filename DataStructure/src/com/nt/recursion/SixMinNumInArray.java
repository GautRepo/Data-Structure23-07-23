package com.nt.recursion;

public class SixMinNumInArray {

	public static void main(String[] args) {
		int[] ar = {2,3,2,1,4,56,0};
		
		int min =Integer.MAX_VALUE;
		int i=0;
		
		findMinNum(ar,min,i);
		

	}

	private static void findMinNum(int[] ar, int min, int i) {
		if(i==ar.length) {
			System.out.println(min);
			return;
		}
		
		if(ar[i]<min)
			min= ar[i];
		i++;
		
		findMinNum(ar,min,i);
		
	}

}
