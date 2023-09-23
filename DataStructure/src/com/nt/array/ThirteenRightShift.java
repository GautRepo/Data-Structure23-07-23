package com.nt.array;

public class ThirteenRightShift {

	public static void main(String[] args) {
		int[] ar = {1,2,3,4,5,6};
		int k =2;
		
		rightShift(ar,k);
		
		for(int a : ar) {
			System.out.print(a +" ");
		}

	}
	
	
	
	public static void rightShift(int[] ar ,int k) {
		
		int[] temparr= new int[k];
		
		int count=0;
		int index =ar.length-1;
		while(count<k) {
			temparr[count] =ar[index];
			index--;
			count++;
		}
		
		for(int i=ar.length-1; i-k>=0;i--) {
			ar[i]= ar[i-k];
		}
		
		for(int i=0; i<k;i++) {
			ar[i]=temparr[i];
		}
		
	}

}
