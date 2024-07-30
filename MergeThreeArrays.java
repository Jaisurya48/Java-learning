package com.Practice;

import java.util.Scanner;

public class MergeThreeArrays {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int array1[]=new int[n1];
		for(int i=0;i<n1;i++) {
			array1[i]=scan.nextInt();
		}
		int n2=scan.nextInt();
		int array2[]=new int[n2];
		for(int i=0;i<n2;i++) {
			array2[i]=scan.nextInt();
		}
		int n3=scan.nextInt();
		int array3[]=new int[n3];
		for(int i=0;i<n3;i++) {
			array3[i]=scan.nextInt();
		}
		//create a result array for store the results
		int result[]=new int[array1.length+array2.length+array3.length];
		int a=0;
		for(int i=0;i<n1;i++) {
			result[a]=array1[i];
			a++;
		}
		for(int i=0;i<n2;i++) {
			result[a]=array2[i];
			a++;
		}
		for(int i=0;i<n3;i++) {
			result[a]=array3[i];
			a++;
		}
		//output the merged arrays
		System.out.print("Merged Arrays: ");
		for(int i=0;i<a;i++) {
			System.out.print(result[i]+" ");
		}
	}
}
