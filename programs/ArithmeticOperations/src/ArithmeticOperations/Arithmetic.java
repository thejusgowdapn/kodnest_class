package ArithmeticOperations;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);

		System.out.println("Enter 2 numbers to subtract");

		int num1=scan.nextInt();

		int num2=scan.nextInt();

		System.out.println(subtractNumbers(num1, num2));

		System.out.println("Enter 2 numbers to multiply");

		num1=scan.nextInt();

		num2=scan.nextInt();

		System.out.println(multiplyNumbers(num1, num2));

		System.out.println("Enter 2 numbers for division ");

		num1=scan.nextInt();

		num2=scan.nextInt();

		System.out.println(divideNumbers(num1, num2));

		System.out.println("Enter 2 numbers to find remainder");

		num1=scan.nextInt();

		num2=scan.nextInt();

		System.out.println(findRemainder(num1, num2));

		}

		public static int subtractNumbers(int num1, int num2)

		{

		return num2-num1;

		}

		public static int multiplyNumbers(int num1, int num2)

		{

		return num1*num2;

		}

		public static double divideNumbers(int num1, int num2)

		{

		return num1/num2;

		}

		public static int findRemainder(int num1, int num2)

		{

		return num1%num2;

		}
}
