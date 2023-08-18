package Taccall;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter total cost");
		double total = scan.nextDouble();
		System.out.println("enter tax rate(in decimal format)");
		double rate = scan.nextDouble();
		System.out.println("Total cost including tax "+calculateTotalWithTax(total,rate));
		

	}
	public static double calculateTotalWithTax(double total,double rate)
	{
		
		return total+(total*rate);
	}

}