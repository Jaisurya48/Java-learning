package com.Practice;

import java.util.Scanner;

public class AllPossibleSubarrays {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		printAllPossibleSubarrays(array);
	}
	public static void printAllPossibleSubarrays(int []array) {
		
		for(int size=1; size<=array.length; size++) {
			
			for(int i=0; i<=array.length-size; i++) {
				for(int j=i; j<i+size; j++) {
					System.out.print(array[j]+" ");
				}
				System.out.println("");
			}
		}
	}
}
