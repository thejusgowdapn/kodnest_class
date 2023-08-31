package sumofdigits;

import java.util.Scanner;

public class Main {
	public static void calculateSumOfDigits(int n) {
		int sum =0;
		int z=n;
		while(z>0) {
			int rem = z%10;
			sum = sum+rem;
			z=z/10;
			
		}
		System.out.println("sum of "+n+" is "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		calculateSumOfDigits(n);

	}

}
