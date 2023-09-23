package com.nt.array;

public class IBinaryToDecimal {

	public static void main(String[] args) {
		
		int num =10;
		double binaryNum= convertToBinary(num);
		
		System.out.println((int)binaryNum);
		
		System.out.println(converToBinaryUsingBitWise(10));
		
		
	}
	
	public static double convertToBinary(int num) {
		double res=0;
		int i =0;
		while(num>0) {
			int k = num %2;
			res=  k*Math.pow(10, i) +res;
			i++;
			num = num/2;
		}
		
		return res;
		
	}
	
	public static double converToBinaryUsingBitWise(int num) {
		double res =0;
		int i =0;
		while(num>0) {
			int k = num & 1;
			res = k * Math.pow(10, i) + res;
			i++;
			num = num >> 1;
		}
		return res;
	}
	
	
}
