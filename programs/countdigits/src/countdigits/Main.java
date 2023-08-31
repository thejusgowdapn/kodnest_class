package countdigits;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ENter n");
		int n = scan.nextInt();
		Helper help = new Helper();
		System.out.println("total number of diits in "+n+" is : "+help.count(n));

	}

}
