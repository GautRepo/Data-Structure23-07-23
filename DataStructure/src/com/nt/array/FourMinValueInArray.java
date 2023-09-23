package com.nt.array;

public class FourMinValueInArray {

	public static void main(String[] args) {
		int[] ar = {1,10,-15,20,11};
		
		System.out.println(findMinNum(ar));

	}
	
	public static int findMinNum(int[] ar) {
		int min = Integer.MAX_VALUE;
		
		for(int a : ar) {
			if(min > a) {
				min =a;
			}
		}
		
		return min;
	}

}
