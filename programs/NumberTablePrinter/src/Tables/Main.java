package Tables;

import java.util.Scanner;

public class Main

{

public static void printTable(int num)

{

// your code here
	for(int i=1;i<=10;i++) {
		System.out.println(num+" * "+i+" = "+num*i);
	}

}

public static void main(String[] args)

{

Scanner scan= new Scanner(System.in);
System.out.println("enter number ");
int num= scan.nextInt();
printTable(num);

}

}
