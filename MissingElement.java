package workout;

import java.util.Scanner;

public class MissingElement {
	public static void main (String []args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []array=new int[n];
		for(int i=0;i<n;i++) {
			array[i]=scan.nextInt();
		}
		findMissingElement(array);
	}
	public static void findMissingElement(int []array) {
		int actualSum=0;
		int n=array.length+1;
		int expectedSum=n*(n+1)/2;
		for(int i=0; i<array.length; i++) {
			actualSum+=array[i];
		}
		int sum=expectedSum-actualSum;
		System.out.println(sum);
	}
}
