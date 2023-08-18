package Temerature;



import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter fahrenheit : ");
		double far= scan.nextDouble();
		TempratureConverter fer=new TempratureConverter();
		double res = fer.convertFahrenheitToCelsius(far);
		System.out.println("result is "+res);
		

	}

}