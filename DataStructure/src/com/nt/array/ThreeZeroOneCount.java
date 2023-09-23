package com.nt.array;

public class ThreeZeroOneCount {

	public static void main(String[] args) {
		int[] ar = {0,1,1,0,1,1,0};
		
		countZero$One(ar);
		

	}

	private static void countZero$One(int[] ar) {
		int zeroCount=0;
		int oneCount=0;
		
		for(int i=0; i<ar.length ;i++) {
			if(ar[i]==0) {
				zeroCount++;
			}
			if(ar[i]==1) {
				oneCount++;
			}
		}
		
		System.out.println("zero count "+ zeroCount + " One Count " + oneCount);
		
	}

}
