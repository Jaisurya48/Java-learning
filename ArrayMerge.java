package com.Practice;

import java.util.Scanner;

public class ArrayMerge {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int A[]=new int[m];
		for(int i=0;i<m;i++) {
			A[i]=scan.nextInt();
		}
		int n=scan.nextInt();
		int B[]=new int[n];
		for(int j=0;j<n;j++) {
			B[j]=scan.nextInt();
		}
		int o=m+n; //new variable for merge the array
		int result[]=new int[o]; 
		int p=0;
		for(int i=0;i<m;i++) {
			result[i]=A[i];
			p++;
		}
		for(int j=0;j<n;j++) {
			result[p]=B[j];
			p++;
		}
		System.out.print("Merged Array: ");
		for(int i=0;i<o;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
