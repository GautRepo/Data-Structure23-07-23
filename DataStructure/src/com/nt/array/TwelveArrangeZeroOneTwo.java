package com.nt.array;

public class TwelveArrangeZeroOneTwo {

	public static void main(String[] args) {
		int[] arr= {0,1,2,0,1,2,0,1,2};
		
		arrangeNum(arr);
		
		for(int a : arr) {
			System.out.print(a +" ");
		}

	}

	private static void arrangeNum(int[] arr) {
		int index=0;
		int left=0;
		int right=arr.length-1;
		
		while(index<=right) {
			if(arr[index]==0) {
				int temp=arr[index];
				arr[index]=arr[left];
				arr[left]=temp;
				index++;
				left++;
			}else if(arr[index]==2) {
				int temp=arr[index];
				arr[index]=arr[right];
				arr[right]=temp;
				right--;
			}else
				index++;
			
		}
		
	}

}
