//Find the smallest subarray in a given array whose sum is equal to a specified value K.

package com.Practice;

import java.util.Scanner;

public class SmallestSubarrayEqualtok {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int k=scanner.nextInt();
		int n = scanner.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		findSmallestSubarrayEqualtok(array,k);
	}
	public static void findSmallestSubarrayEqualtok(int []array,int k) {
		boolean found=false;
		for(int size=0; size<=array.length; size++) {
			
			for(int i=0; i<=array.length-size; i++) {
				int sum=0;
				for(int j=i; j<i+size; j++) {
					sum=sum+array[j];
				}
				if(sum==k) {
					for(int j=i; j<i+size; j++) {
						System.out.print(array[j]+" ");
					}
					System.out.println();
					return;
				}
			}
		}if(!found) {
			System.out.println("No suarray found.");
		}
	}
}
