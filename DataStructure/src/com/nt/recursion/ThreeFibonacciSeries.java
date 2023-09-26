package com.nt.recursion;

public class ThreeFibonacciSeries {

	public static void main(String[] args) {
		int n =9;
		
		int num = fibonacii(n);
		System.out.println(num);

	}

	private static int fibonacii(int n) {
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		
		return fibonacii(n-1) + fibonacii(n-2);
	}

}
