package com.wipro.basic;

public class Sortedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,2,3,4,4,5};
		int length= arr.length;
		int res=1;
		System.out.println(arr[0]+"");
		for(int i=1;i<length;i++) {
			if(arr[i]!=arr[i-1]) {
				System.out.println(arr[i]);
				res++;
			}
		}
		System.out.println(res);

	}

}
