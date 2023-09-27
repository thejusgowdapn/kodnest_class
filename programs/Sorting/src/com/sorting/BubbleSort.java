package com.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Ennter array length ");
		int arr[] = new int[s.nextInt()];
		System.out.println("enter "+arr.length+" array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		int n = arr.length;
		System.out.println("Array elemets before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<=n-2;i++) {
			for(int j=0;j<=n-2-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("array elemets after sorting ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		

	}

}
