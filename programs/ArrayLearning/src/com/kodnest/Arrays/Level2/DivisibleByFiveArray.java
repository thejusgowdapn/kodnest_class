package com.kodnest.Arrays.Level2;

import java.util.Scanner;

public class DivisibleByFiveArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int n = s.nextInt();
		int arr[] = new int[n];
		System.out.println("enter elements of  array : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		System.out.println("printing only  numbers which are divisible by 5  in array : ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5 == 0) {
			System.out.print(arr[i]+" ");
			}
		}

	}

}
