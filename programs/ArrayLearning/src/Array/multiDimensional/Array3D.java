package Array.multiDimensional;

import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
//		int [][][] arr = new int[2][][];
//		arr[0]= new int [2][];
//		arr[1]= new int [3][];
//		arr[0][0] = new int[3];
//		arr[0][1]= new int[4];
//		arr[1][0] = new int[3];
//		arr[1][1] = new int[2];
//		arr[1][2] = new int[4];
		System.out.println("enter the length of 1st dimension");
		int length = s.nextInt();	
		int [][][] arr = new int[length][][];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the length of 2nd dimension of "+i);
			arr[i] = new int[s.nextInt()][];
		}
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the lengthof 3rd dimesion of "+i+" "+j);
				arr[i][j] = new int[s.nextInt()];
			}
		}
		
		
		System.out.println("taking input");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int z=0;z<arr[i][j].length;z++) {
					System.out.print("enter value for arr["+i+"]["+j+"]["+z+"] : ");
					arr[i][j][z] = s.nextInt();
				}
			}
		}
		
		System.out.println("Print elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int z=0;z<arr[i][j].length;z++) {
					System.out.print("arr["+i+"]["+j+"]["+z+"] : ");
					System.out.print(arr[i][j][z]);
					System.out.println();
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
