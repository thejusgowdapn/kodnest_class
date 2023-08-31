package powerof2power;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Helper help = new Helper();
		Scanner scan = new Scanner(System.in);
		System.out.println("enter n");
		int n = scan.nextInt();
		System.out.println("the power of "+n+" is "+Helper.power(n));
		

	}

}
