package Logical;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Is input valid (true/false):");
		boolean a = scan.nextBoolean();
		System.out.println("Does input meet a certain condition (true/false):");
		boolean b= scan.nextBoolean();
		isValidInput(a,b);
		

	}
	public static void isValidInput(boolean a,boolean b) {
		if(a && b) {
			System.out.println("Input is valid");
		}else {
			System.out.println("Input is not valid");
		}
	}
}
