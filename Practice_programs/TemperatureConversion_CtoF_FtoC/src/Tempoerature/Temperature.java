package Tempoerature;


import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1 to convert celsius to Fahrenheit");
		System.out.println("Enter 2 to convert Fahrenheit to celsius");
		int c=scan.nextInt();
		switch(c) {
			case 1: System.out.println("Enter celsius value");
					double n = scan.nextDouble();
					System.out.println(n+" celsius is fahrenheit ="+celsiusToFahrenheit(n));
					break;
			case 2: System.out.println("Enter fahrenheit value");
					double z = scan.nextDouble();
					System.out.println(z+" fahrenheit is celsius ="+fahrenheitToCelsius(z));
					break;
			default: System.out.println("enter valid imput value");
		
				
		}

	}
	public static double celsiusToFahrenheit(double celsius)
	{
		return (celsius * 9/5) + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		return  (fahrenheit-32)*5/9;
	}

}