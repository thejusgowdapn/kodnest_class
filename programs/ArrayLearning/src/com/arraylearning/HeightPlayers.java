package com.arraylearning;

import java.util.Scanner;

public class HeightPlayers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float []arr = new float[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the height of player : "+(i+1));
			arr[i] = scan.nextFloat();
		}
		System.out.println("printing marks");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Height of player "+(i+1)+" is "+arr[i]);
		}

	}

}
