package Search;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int arr[],int key) {
		int low =0;
		int high= arr.length - 1;
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == key) {
				return mid;
			}
			else if(key<arr[mid]) {
				high = mid -1;
			}else {
				low = mid+1;
			}
	  }
		return -1;
	}

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("Enter array length");
		int arr[] = new int[s.nextInt()];
		System.out.println("Enter array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();		
		}
		System.out.println("enter key to find ");
		int key = s.nextInt();
		int result = binarySearch(arr,key);
		if(result == -1) {
			System.out.println("element not found ");
			
		}else {
			System.out.println(key+" found in "+result);
		}
		
	}
	

}
