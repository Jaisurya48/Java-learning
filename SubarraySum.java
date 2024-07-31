package com.Practice;
import java.util.*;

public class SubarraySum {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		int k=scanner.nextInt();
		printSubarraySum(array,k);
	}
	public static void printSubarraySum(int []array,int k) {
		for(int size=1;size<=array.length;size++) {
			for(int i=0;i<=array.length-size;i++) {
				int sum=0;
				for(int j=i;j<i+size;j++) 
				{
					sum += array[j];
				}
				if(sum==k) {
					for(int j=i;j<i+size;j++) {
						System.out.print(array[j]+" ");
					}
					System.out.println("");
				}
			}
		}
		
	}
}
