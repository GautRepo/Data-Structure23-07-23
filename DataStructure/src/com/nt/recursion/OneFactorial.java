package com.nt.recursion;

import java.util.Scanner;

public class OneFactorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		int a = sc.nextInt();
		
		int res =findFactorial(a);
		System.out.println(res);
		

	}

	private static int findFactorial(int a) {
		
		if(a ==1 ) {
			return 1;
		}
		
		return a * findFactorial(a-1);
		
	}

}
