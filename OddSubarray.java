package com.Practice;
import java.util.*;

public class OddSubarray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		printOddSubarray(array);
	}
	public static void printOddSubarray(int []array) {
		
		for(int size=1; size<=array.length; size+=2) {
			
			for(int i=0; i<=array.length-size; i++) {
				for(int j=i; j<i+size; j++) {
					System.out.print(array[j]+" ");
				}
				System.out.println("");
			}
		}
	}
}
