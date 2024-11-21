package newJavaQn;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=scan.nextInt();
		}
		remove(a);
	}
	public static void remove(int []a) {
		LinkedHashSet<Integer> UniqueElements=new LinkedHashSet<>();
		for(int i:a) {
			UniqueElements.add(i);
		}
		
		int Res[]=new int[UniqueElements.size()];
		int j=0;
		for(int num:UniqueElements) {
			Res[j++]=num;
			
		}
		Arrays.sort(Res);
		
		for(int Ans : Res) {
			System.out.println(Ans);
		}
	}
}
