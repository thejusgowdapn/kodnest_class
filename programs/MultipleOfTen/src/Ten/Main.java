package Ten;

import java.util.Scanner;



public class Main {
	public static void  checkMultipleOfTen(int n)
	{
		if(n%10==0) {
			System.out.println("this number  is multiple of 10");
		}else {
			System.out.println("this number  is not1 multiple of 10");
		}

	}
	public static void main(String []args)
	{
	Scanner scan = new Scanner(System.in);
	System.out.println("ENter a number ");
	int n = scan.nextInt();
	checkMultipleOfTen(n);
	}

}
