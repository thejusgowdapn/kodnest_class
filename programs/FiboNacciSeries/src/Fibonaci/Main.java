package Fibonaci;

import java.util.Scanner;

public class Main {
	public static void printFibonacciSeries(int n) {
		
		int a =0;
		int b=1;
		if(n==1 || n==0) {
			System.out.print(a);
			return;
		}
		if(n>=2) {
			System.out.print(a+" "+b+" ");
			for(int i=3;i<=n;i++)
			{
				int c = a + b;
				a = b;
				b = c;
				System.out.print(c+" ");
			}
		}	
}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ENter number");
		int a = scan.nextInt();
		printFibonacciSeries(a);
		
	}
}
