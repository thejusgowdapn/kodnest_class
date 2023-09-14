package com.arraylearning;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = new int[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the marks of student : "+(i+1));
			arr[i] = scan.nextInt();
		}
		System.out.println("printing marks");
		for(int i=0;i<arr.length;i++) {
			System.out.println("marks of student "+(i+1)+" is "+arr[i]);
		}

	}
        

}
