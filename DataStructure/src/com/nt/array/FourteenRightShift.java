package com.nt.array;

public class FourteenRightShift {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6,7};
		int k =2;
		
		rightShift(ar,k);

		/*for(int a : ar ) {
			System.out.print(a+" ");
		}*/
	}
	
	public static void rightShift(int[] ar, int k) {
		
		/*for(int i=0; i< ar.length;i++) {
			int index =(i+k) % ar.length;
			ar[index]= ar[i];
		}*/
		
		int[] temp = new int[ar.length];
		int i=0;
		while(i<ar.length) {
			
			temp[(i+k)%ar.length] =ar[i];
			i++;
		}
		
		for(int a : temp) {
			System.out.print(a+" ");
		}
	}
	
	

}
