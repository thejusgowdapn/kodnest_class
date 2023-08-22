package SetBitCounter;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter integer ");
		int n = scan.nextInt();
		
		System.out.println("Number of set bits : "+countSetBits(n));
	}
	public static int countSetBits(int n) {
		int count=0;
		while(n>0) {
			count+=n&1;
			n >>=1;
		}
		return count;
	}

}
