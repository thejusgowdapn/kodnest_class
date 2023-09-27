package com.sorting;

import java.util.Scanner;

public class SelectionSorting {
	
	public static void sort(int []arr) {
		for(int i=0;i<=arr.length-2;i++) {
			int min= arr[i];
			int pos = i;
			for(int j=i;j<arr.length;j++) {
				if(arr[j]<min) {
					min = arr[j];
					pos = j;
				}
				
			}
			int temp = arr[i];
			arr[i] = arr[pos];
			arr[pos]= temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter array length");
		int arr[] = new int[s.nextInt()];
		System.out.println("enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("array before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		sort(arr);
		System.out.println("array After sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}

}
