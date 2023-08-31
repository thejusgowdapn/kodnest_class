package powerofn;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number ");
		int n = scan.nextInt();
		System.out.println("enter power ");
		int pow = scan.nextInt();
		Helper help = new Helper();
		System.out.println(n+"power of "+pow+" is : "+help.powerofn(n,pow));
		scan.close();

	}

}
