package vending;

import java.util.Scanner;

public class Main {
	public static void getProduct(String p) {
		
		
		if(p.equals("p01")) {
			 System.out.println("Pepsi");
		}
		else if(p.equals("p02")) {
			 System.out.println("Cocacola");
			
		}else if(p.equals("p03")) {
			 System.out.println("Fanta");
		
		}else if(p.equals("p04")) {
			 System.out.println("JalJeera");
			
		}else if(p.equals("p05")) {
			 System.out.println("MountainDew");
			
		}else if(p.equals("p06")) {
			System.out.println("BoatGuava");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter code");
		String code=scan.next();
		getProduct(code);

	}

}


// Pepsi,Cocacola,Fanta,JalJeera,MountainDew,and BoatGuava in the list