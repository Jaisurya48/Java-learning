package com.Practice;

import java.util.Scanner;

public class LongestSubarrayEqualtoK {
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
		int k=scanner.nextInt();
		int n = scanner.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		printLongestSubarrayEqualtoK(array,k);
		scanner.close();
	}
	public static void printLongestSubarrayEqualtoK(int []array,int k) {
		boolean found=false;
		for(int size=array.length; size>=1; size--) {
			for(int i=0; i<=array.length-size; i++) {
				int sum=0;
				for(int j=i; j<i+size; j++) {
					sum=sum+array[j];
				}
				if(sum==k) {
					for(int j=i; j<i+size; j++) {
						found=true;
						System.out.print(array[j]+" ");
					}
					System.out.println();
					return;
				}
			}
		}
		if(!found) {
			System.out.print("No subarray found.");
		}
	}
		
}
