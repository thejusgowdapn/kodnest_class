package DiscountApplicable;
import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double price=scan.nextDouble();
		checkDiscount(price);
		

	}
	public static void checkDiscount(double purchaseAmount) {
		if(purchaseAmount>=100) {
			System.out.println("Discount applicable");
		} else {
			System.out.println("Discount not applicable");
		}
	}

}
