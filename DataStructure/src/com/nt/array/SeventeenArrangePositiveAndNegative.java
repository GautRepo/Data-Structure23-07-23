package com.nt.array;

public class SeventeenArrangePositiveAndNegative {

	public static void main(String[] args) {
		
		int[] ar = {10,-11,13,12,-10,-24};
		
		arrangeNum(ar);
		
		for(int i=0;i<ar.length; i++) {
			System.out.println(ar[i]+" ");
		}

	}

	private static void arrangeNum(int[] ar) {
		int i=0;
		int j=1;
		
		while(j<ar.length) {
			if(ar[i]>0 && ar[j]<0) {
				int temp =ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
				i++;
				j++;
			}else {
				j++;
			}
		}
		
	}

}
