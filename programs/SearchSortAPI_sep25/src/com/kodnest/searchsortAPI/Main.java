package com.kodnest.searchsortAPI;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
				Scanner s = new Scanner(System.in);
				System.out.println("Ennter array length ");
				int arr[] = new int[s.nextInt()];
				System.out.println("enter "+arr.length+" array elements");
				for(int i=0;i<arr.length;i++) {
					arr[i] = s.nextInt();
				}
				KodNestSearchSort kn = new KodNestSearchSort();
				
				while(true) {
					System.out.println("Enter your choice ");
					System.out.println("Enter 1 for searching ");
					System.out.println("Enter 2 for sorting ");
					System.out.println("Enter 3 for finding minium or maxiimun ");
					System.out.println("Enter any one for exit ");
					int choice = s.nextInt();
					switch(choice) {
					
					case 1: System.out.println("Linear search -> 1 or Binary search -> 2 ");
							int choice1 = s.nextInt();
							if(choice1 == 1) {
								System.out.println("enter key to search");
								int key = s.nextInt();
								
								int res = kn.linearSearch(arr, key);
								if(res<0) {
									System.out.println(key+" not found");
								}else {
									System.out.println(key+" found at indec "+res);
								}
							}
							else if(choice1 == 2) {
								System.out.println("enter key to search");
								int key = s.nextInt();
								
								int res = kn.binarySearch(arr, key);
								if(res<0) {
									System.out.println(key+" not found");
								}else {
									System.out.println(key+" found at indec "+res);
								}
							}
							else {
								System.out.println("go to vasan eye care ");
								return;
								}
							
						break;
					case 2:	System.out.println("press 1 for Ascending Bubble-Sort");
					System.out.println("press 2 for Descending Bubble-Sort");
					System.out.println("press 3 for Ascending  Selection-Sort");
					System.out.println("press 4 for Descending Selection-Sort");
					System.out.println("press 5 for Ascending Insertion-Sort");
					System.out.println("press 6 for Descending Insertion-Sort");
					int choice3 = s.nextInt();
					if(choice3 == 1) {
						kn.bubbleSortAscending(arr);
						System.out.println("after sorting ");
						for(int i=0;i<arr.length;i++) {
							System.out.print(arr[i]+" ");
						}
						System.out.println();
						
					}else if(choice3 == 2) {
						kn.bubbleSortDescending(arr);
						System.out.println("after sorting ");
						for(int i=0;i<arr.length;i++) {
							System.out.print(arr[i]+" ");
						}
						System.out.println();
					}
						
					else if(choice3 == 3) {
						kn.selectionSortAscending(arr);
						System.out.println("after sorting ");
						for(int i=0;i<arr.length;i++) {
							System.out.print(arr[i]+" ");
						}
						System.out.println();
						
					}else if(choice3 == 4) {
						kn.selectionSortDescending(arr);
						System.out.println("after sorting ");
						for(int i=0;i<arr.length;i++) {
							System.out.print(arr[i]+" ");
						}
						System.out.println();
						
					}else if(choice3 == 5) {
						kn.insertionSortAscending(arr);
						System.out.println("after sorting ");
						for(int i=0;i<arr.length;i++) {
							System.out.print(arr[i]+" ");
						}
						System.out.println();
						
					}else if(choice3 == 6) {
						kn.selectionSortDescending(arr);
						System.out.println("after sorting ");
						for(int i=0;i<arr.length;i++) {
							System.out.print(arr[i]+" ");
						}
						System.out.println();
						
					}else {
						System.out.println("go to vasan eye care");
						return;
					}
						break;
					case 3:
						System.out.println("ENter 1 for minium");
						System.out.println("ENter 2 for maximun");
						int choice4 = s.nextInt();
						if(choice4==1) {
							System.out.println("minium element in array is : "+kn.findMinimum(arr));
						}else if(choice4==2) {
							System.out.println("maximun element in array is : "+kn.findMinimum(arr));
						}else {
							System.out.println("go to vasan");
							return;
						}
						
						break;
					default: System.out.println("exit----");
								return;
					
							}
					}
				

	}
}
