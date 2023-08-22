package Bitwise;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first integer:");
		int x=scan.nextInt();
		System.out.println("Enter the second integer:");
		int y=scan.nextInt();
		swapUsingBitwise(x,y);
		
		

	}
	
public static void swapUsingBitwise(int x,int y) {
	x = x^y;
	y=x^y;
	x=x^y;
	System.out.println("After swapping: First = "+x+" , Second = "+y);
	
}

}
