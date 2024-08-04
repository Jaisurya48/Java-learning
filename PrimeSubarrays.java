	//Print all possible subarrays whose sum is prime.

package com.Practice;
import java.util.Scanner;

public class PrimeSubarrays {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		printSubarraysumPrime(array);
	}
	public static boolean checkifPrime(int n){
		if(n<=1) {
			return false;
		}
		for(int i=2;i*i<=n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void printSubarraysumPrime(int []array) {
		boolean found=false;
		for(int size=1; size<=array.length; size++) {
			
			for(int i=0; i<=array.length-size; i++) {
				int sum=0;
				for(int j=i; j<i+size; j++) {
					sum+=array[j];
				}if(checkifPrime(sum)) {
					for(int j=i; j<i+size; j++) {
						found=true;
						System.out.print(array[j]+" ");
					}
					System.out.println();
				}
			}
		}if(!found){
			System.out.println("None.");
		}
	}
}
