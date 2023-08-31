package powerofnumberofitscount;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		Helper help = new Helper();
		System.out.println("ans : "+ help.power(n));

	}

}
