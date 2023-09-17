package com.nt.test;

public class TwoLinearSearch {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6};
		
		int a =7;
		
		System.out.println(linearSearch(ar , a));

	}
	
	public static boolean linearSearch(int[] ar, int a) {
		boolean flag = false;
		for(int i=0; i<ar.length; i++) {
			if(ar[i] == a) {
				flag=true;
				break;
			}
		}
		
		return flag;
		
	}

}
