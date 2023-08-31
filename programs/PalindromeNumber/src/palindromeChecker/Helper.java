package palindromeChecker;

public class Helper {
	
	public void palindrome(int n)
	{
		
		int rev=0;
		int c = n;
		while(c>0) {
			int rem = c%10;
			rev=(rev*10)+rem;
			c=c/10;
		}
		System.out.println("reverse "+rev);
		if(n==rev) {
			System.out.println("the given number "+n+" is palindrome");
		}else {
			System.out.println("the given number "+n+" is not palindrome");
		}
	}

}
