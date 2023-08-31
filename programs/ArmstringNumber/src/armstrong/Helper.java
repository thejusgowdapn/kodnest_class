package armstrong;

public class Helper {
	boolean isArmstrong(int n){
		int sum =0;
		int cpy = n;
		int count = countDigits(n);
		while(n>0) {
			int rem = n%10;
			sum = sum +(int) Math.pow(rem, count);
			n=n/10;
		}
		if(cpy==sum) {
			return true;
		}
		return false;
		
	}
	int countDigits(int n) {
		int count =0;
		while(n>0) {
			n = n/10;
			count++;
		}
		
		return count;
	}

}
