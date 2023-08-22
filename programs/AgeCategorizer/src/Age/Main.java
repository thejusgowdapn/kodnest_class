package Age;

import java.util.Scanner;

public class Main {
	public static void categorizeAge(int age) {
		if(age>0 && age<=13) {
			System.out.println("child");
		}else if(age>=13 && age<=19) {
			System.out.println("Teen");
			
		}else if(age>=20 && age<=59) {
			System.out.println("Adult");
		}else {
			System.out.println("senior");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ennter age");
		int n=scan.nextInt();
		categorizeAge(n);
		
	}

}
