package com.nt.test;

public class TenRightShift {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		int index=1;
		rightShift(arr,index);
		
		

	}
	
	public static void rightShift(int[] arr,int index) {
		int temp =arr[arr.length-1];
		for(int i =arr.length-1; i>0;i--) {
			arr[i]=arr[i-1];
		}
		arr[0]=temp;
	}

}
