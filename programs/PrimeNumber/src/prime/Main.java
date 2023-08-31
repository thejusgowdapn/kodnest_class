package prime;

import java.util.Scanner;

public class Main

{

public static void printPrimes(int n)

{
	int prime=2;
	
	for(int i=1;i<=n;) {
		int count =0;
		for(int z=2;z<=prime/2;z++) {
			if(prime%z==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(prime+" ");
			i++;
		}
		prime++;
		
	}	
	

// your code here

}

public static void main(String[] args)

{

//COde here
	Scanner scan = new Scanner(System.in);
	int n = scan.nextInt();
	printPrimes(n);

}

}
