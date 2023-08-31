package powerofnumberofitscount;

public class Helper {
	public int power(int n){
		int z=n;
	int count =0;
	while(n>0) {
		n=n/10;
		count++;
	}
	int res=1;
	for(int i=1;i<=count;i++) {
		
		res=res*z;
		
	}
	return res ;
	}

}
