package com.Practice;

import java.util.Scanner;

public class SumofSubarrayequalK {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int k=scan.nextInt();
			int n = scan.nextInt();
			int array[] = new int[n];
			for (int i = 0; i < n; i++) {
				array[i] = scan.nextInt();
			}
			printSumofSubarrayequalK(array,k);
		}
		public static void printSumofSubarrayequalK(int []array,int k) {
				
				for(int i=0; i<=array.length-k; i++) {
					int sum=0;
					for(int j=i; j<i+k; j++) {
						sum+=array[j];
					}
					System.out.print(sum+" ");
				}
		}
}
