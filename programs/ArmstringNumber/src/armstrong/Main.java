package armstrong;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Armstrong number is a number that is equal to the sum of cubes of its digits.
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter n");
		int n=s1.nextInt();
		Helper help = new Helper();
		if(help.isArmstrong(n)) {
			System.out.println(n+" is Armstrong number");
		}
		else {
			System.out.println(n+" is not Armstrong number");
		}
		

	}

}
