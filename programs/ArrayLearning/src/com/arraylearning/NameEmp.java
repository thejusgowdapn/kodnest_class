package com.arraylearning;

import java.util.Scanner;

public class NameEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []arr = new String[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the name of Employee : "+(i+1));
			arr[i] = scan.nextLine();
		}
		System.out.println("printing marks");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Name of Employee "+(i+1)+" is "+arr[i]);
		}

	}

}
