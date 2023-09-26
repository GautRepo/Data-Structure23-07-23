package com.nt.recursion;

import java.util.Scanner;

public class TwoReverseCounting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num ");
		int num =sc.nextInt();
		
		reverseCounting(num);
	

	}

	private static void reverseCounting(int num) {
		
		if(num ==0) {
			return;
		}
		System.out.println(num);
		
		reverseCounting(num-1);
		
	}

}
