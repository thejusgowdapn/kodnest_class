package DoubleTrouble;

import java.util.Scanner;

public class Trouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = scan.nextInt();
		System.out.println("double of number is "+doubleTheNumber(num));

	}
	public static int doubleTheNumber(int num) {
		return num + num;
	}

}
