package workout;

import java.util.Scanner;

public class CountOccofIntegers {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []a=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=scan.nextInt();
		}
		int k=scan.nextInt();
		OccOfInteger(a,k);
	}
	public static void OccOfInteger(int []a,int k) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==k) {
				count++;
			}
		}
		System.out.print(count);
	}
}
