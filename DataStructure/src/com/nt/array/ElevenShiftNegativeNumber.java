package com.nt.array;

public class ElevenShiftNegativeNumber {

	public static void main(String[] args) {
		
		int[] arr = {1,2,-3,4,3,-5,-10};
		
		shiftNegativeNum(arr);
		
		for(int a : arr) {
			System.out.print(a +" ");
		}

	}

	private static void shiftNegativeNum(int[] arr) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				continue;
			}else {
				int temp=arr[j];
				arr[j]=arr[i];
				arr[i]=temp;
				j++;
			}
		}
	}

}
