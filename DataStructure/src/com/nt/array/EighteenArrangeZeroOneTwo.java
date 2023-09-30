package com.nt.array;

public class EighteenArrangeZeroOneTwo {

	public static void main(String[] args) {
		int[] ar= {1,2,0,1,2,0,0,1,1};
		
		arrangeZeroOne(ar);
		
		for(int a :ar) {
			System.out.print(a +" ");
		}

	}

	private static void arrangeZeroOne(int[] ar) {
		
		int s=0;
		int e= ar.length-1;
		int index=0;
		while(index<=e) {
			if(ar[index]==0) {
				int temp = ar[index];
				ar[index]=ar[s];
				ar[s]=temp;
				s++;
				index++;
			}else if(ar[index]==2){
				int temp =ar[index];
				ar[index]=ar[e];
				ar[e]=temp;
				e--;
			}else {
				index++;
			}
		}
		
	}

}
