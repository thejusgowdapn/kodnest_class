package caldilemenea;


import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1 for Addition");
		System.out.println("Enter 2 for Subtraction");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		System.out.println("-----------------------------------");
		System.out.println("enter any number between 1 to 4 : ");
		int choise = scan.nextInt();
		System.out.println("ENter number 1 ");
		int n1 = scan.nextInt();
		System.out.println("ENter number 2 ");
		int n2 = scan.nextInt();
		calci(choise,n1,n2);
		
		
		
	}
	static void calci(int n,int n1,int n2) {
		switch(n)
		{
		case 1: System.out.println("Addition of "+n1+" and "+n2+" is = "+(n1+n2));
				break;
		case 2: System.out.println("Subtraction of "+n1+" and  "+n2+" is = "+(n1-n2));
				break;
		case 3: System.out.println("Multiplication of "+n1+" and  "+n2+" is = "+(n1*n2));
				break;
		case 4: System.out.println("Division of "+n1+" and  "+n2+" is = "+(n1/n2));
				break;
		default: System.out.println("invalid!!!! enter numbers between 1 to 4 only");
		}
	}

}