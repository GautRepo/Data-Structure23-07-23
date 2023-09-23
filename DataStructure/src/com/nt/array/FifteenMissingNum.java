package com.nt.array;

public class FifteenMissingNum {

	public static void main(String[] args) {
		int[] ar = {1,2,3,5,6,7,8};
		
		System.out.println(findMissingNum(ar));

	}

	private static int findMissingNum(int[] ar) {
		int expectedSum = ((8/2)*(1+8)); //n/2(A1 +An)
		int sum =0;
		
		for(int a : ar) {
			sum += a;
		}
		
		return (expectedSum-sum);
	}

}
