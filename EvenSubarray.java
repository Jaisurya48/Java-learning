package com.Practice;
import java.util.*;

public class EvenSubarray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}
		printEvenSubarray(array);
	}
	public static void printEvenSubarray(int []array) {
		boolean found=false;
		for(int size=2; size<=array.length; size+=2) {
			
			for(int i=0; i<=array.length-size; i++) {
				
				for(int j=i; j<i+size; j++) {
					
					System.out.print(array[j]+" ");
					found=true;
				}
				
				System.out.println("");
			}
		}
		if(!found) {
			System.out.println("None");
		}
	}
}
