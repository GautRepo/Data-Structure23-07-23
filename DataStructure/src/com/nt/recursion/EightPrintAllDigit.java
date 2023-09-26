package com.nt.recursion;

public class EightPrintAllDigit {

	public static void main(String[] args) {
		int num =234;
		
		printAllDigit(num);

	}

	private static void printAllDigit(int num) {
		
		if(num==0) {
			return;
		}
		
		int lastDigit= num%10;
		System.out.println(lastDigit);
		num = num/10;
		printAllDigit(num);
		
	}
	
	

}
