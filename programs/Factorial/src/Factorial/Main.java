package Factorial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		factorial(n);

	}
	public static void  factorial(int n)
	{
		int p=1;
		while(n>0) {
			p = p*n;
			n--;
		}
		System.out.println("factoril of "+n+" is " +p);
	}

}
