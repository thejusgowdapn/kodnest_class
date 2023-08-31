package Even;

import java.util.Scanner;

public class Main

{

public static void printEvenNumbers(int n)

{

// your code here
		for(int i=2;i<=n;i++)
		{
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}

}

public static void main(String[] args)

{

//code here
	Scanner scan = new Scanner(System.in);
	System.out.println("enter number");
	int n = scan.nextInt();
	printEvenNumbers(n);

}

}