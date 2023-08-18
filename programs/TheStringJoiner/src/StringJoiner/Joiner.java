package StringJoiner;

import java.util.Scanner;

public class Joiner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter first : ");
		String str1 = scan.next();
		System.out.println("enter second : ");
		String str2 = scan.next();
		System.out.println(joinStrings(str1,str2));
		
		

	}
	public static String joinStrings(String str1, String str2) {
		return str1+" "+str2;
	}

}