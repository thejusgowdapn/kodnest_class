package GCD;

import java.util.Scanner;

public class Main {
	
	public static void findGCD(int a, int b) {
		
			while(b>0) {
			int c= a%b;
			
			if(c==0) {
				System.out.println(b);
				return;
			}
			a=b;
			b=c;
		}
			
		
		
		 
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter n1 and n2 :");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		findGCD(n1,n2);
		

	}

}
