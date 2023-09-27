package com.sorting;

import java.util.Scanner;

public class InsertionSort {
	
	public static void insertionSort(int []arr) {
		for(int i=1;i<arr.length;i++) {
			int item = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>item) {
				arr[j+1]= arr[j];
				j--;
			}
			arr[j+1]= item;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter array length");
		int []arr = new int[s.nextInt()];
		System.out.println("enter "+arr.length+" array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]= s.nextInt();
		}
		System.out.println("Before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		insertionSort(arr);
		System.out.println("After sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		

	}

}
