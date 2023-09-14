package Array.multiDimensional;

import java.util.Scanner;

public class Multi2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int [][] arr = new  int[3][];
		arr[0] = new int[3];
		arr[1] = new int[2];
		arr[2] = new int[4];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("ENter the age of class "+i+" student "+j);
				arr[i][j]= s.nextInt();
			}
		}
		System.out.println("------------printing---------------");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(" | "+arr[i][j]+" | ");
			
			}
			System.out.println();
		}

	}

}
