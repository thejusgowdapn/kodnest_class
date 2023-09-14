package com.arraylearning;

import java.util.Scanner;

public class BankCus2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String [][]arr = new String[3][6];
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.println("enter the name of customer "+j+" of bank "+i);
				arr[i][j] = s.next();
			}
		
		}
		System.out.println(" printing array");
		for(int i=0;i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		
		}
		

	}

}
