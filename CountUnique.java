package com.Practice;

import java.util.Scanner;

public class CountUnique {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int A[]=new int[n];
		for(int i=0;i<n;i++) {
			A[i]=scan.nextInt();
		}
		int res=printUniqueCount(A);
		System.out.print(res);
	}
	public static int printUniqueCount(int []A) {
		int uniqueCount=1;
		for(int i=1;i<A.length;i++) {
			if(A[i]!=A[i-1]) {
				uniqueCount++;
			}
		}
		return uniqueCount;
	}
}
