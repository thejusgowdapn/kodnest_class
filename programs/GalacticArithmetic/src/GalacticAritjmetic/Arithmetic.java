package GalacticAritjmetic;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println(galacticAddition(num1,num2));
		

	}
	public static long galacticAddition(long num1, long num2) {
		return num1+num2;
	}

}
