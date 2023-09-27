package Search;

import java.util.Scanner;

public class LinearSearch {
	public static int linearSearch(int []arr,int key) {
		int ans = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[] = new int[s.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();		
		}
		System.out.println("enter key to find ");
		int key = s.nextInt();
		int result = linearSearch(arr,key);
		if(result == -1) {
			System.out.println("element not found ");
			
		}else {
			System.out.println(key+" found in "+result);
		}
		
	}

}
