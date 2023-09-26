package com.nt.recursion;

public class FourClimbingSteps {

	public static void main(String[] args) {
		
		int num=3;
		
		int res =numOfWays(num);
		System.out.println(res);

	}

	private static int numOfWays(int num) {
		
		if(num ==0 || num ==1)
			return 1;
		
		return numOfWays(num-1)+ numOfWays(num-2);
		
	}

}
