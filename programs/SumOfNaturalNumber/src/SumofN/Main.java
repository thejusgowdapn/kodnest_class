package SumofN;

import java.util.Scanner;

public class Main

{

public static void calculateSum(int n)

{

	System.out.println("sum is :"+(n*(n+1))/2);
// your code here

}

public static void main(String[] args)

{
	Scanner scan = new Scanner(System.in);
	System.out.println("enter number");
	int n = scan.nextInt();
	calculateSum(n);

}

}
