package com.Practice;

import java.util.Scanner;

public class NonRepeatingElements {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=scan.nextInt();
		}
		for(int i=0;i<A.length;i++) {
			if((i==0||A[i]!=A[i-1]) && (i==n-1||A[i]!=A[i+1])) {
				System.out.print(A[i]+" ");
			}
		}
	}
}
