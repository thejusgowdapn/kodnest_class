package powerofn;

public class Helper {
	public  int powerofn(int n,int pow) {
		System.out.println("outside");
		int res=1;
		for(int i=1;i<=pow;i++) {
			
			res=res*n;
			
		}
		return res;
	}

}
