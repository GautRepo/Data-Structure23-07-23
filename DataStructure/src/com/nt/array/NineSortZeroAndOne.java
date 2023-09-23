package com.nt.array;

public class NineSortZeroAndOne {

	public static void main(String[] args) {
		int[] ar = {1,1,0,1,1,0,1,0};
		
		sortZeroAndOne(ar);
		
		for(int i=0; i<ar.length ;i++) {
			System.out.print(ar[i]+" ");
		}

	}
	
	public static void sortZeroAndOne(int[] ar) {
		int start =0;
		int end =ar.length-1;
		
		while(start<=end) {
			
			if(ar[start]==0) {
				start++;
			}
			else if(ar[end]==1) {
				end--;
			}else {
				int temp = ar[start];
				ar[start]=ar[end];
				ar[end]=temp;
			}
			
		}
	}

}
