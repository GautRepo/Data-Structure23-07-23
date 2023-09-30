package com.nt.array;

public class NineteenRotateArray {

	public static void main(String[] args) {
		int[] ar = {10,20,30,40,50,60};
		int k =2;
		
		rotateArray(ar,k);
		
		
		

	}

	private static void rotateArray(int[] ar, int k) {
		int[] arr = new int[ar.length];
		for(int i =0 ;i<ar.length;i++) {
			int index = (i+k)%ar.length;
			arr[index]=ar[i];
			
		}
		for(int a : arr) {
			System.out.print(a +" ");
		}
	}

}
