package workout;

import java.util.Arrays;
import java.util.Scanner;

public class arraymerge {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int arr1[]=new int[m];
		for(int i=0;i<m;i++) {
			arr1[i]=scan.nextInt();
		}
		int n=scan.nextInt();
		int arr2[]=new int[n];
		for(int i=0;i<n;i++) {
			arr2[i]=scan.nextInt();
		}
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int result[]=ArrayMerge(arr1,arr2);
		System.out.print("The merged array: ");
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}
	public static int[] ArrayMerge(int []arr1,int []arr2) {
		int i=0;
		int j=0;
		int k=0;
		int result[]=new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<=arr2[j]) {
				result[k++]=arr1[i++];
			}
			else {
				result[k++]=arr2[j++];
			}
		}
		while(i<arr1.length) {
			result[k++]=arr1[i++];
		}
		while(j<arr2.length) {
			result[k++]=arr2[j++];
		}
		return result;
	}
}
