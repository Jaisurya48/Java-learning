package workout;
import java.util.*;

public class LargestElementinArray {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int []array=new int[n];
		for(int i=0; i<n; i++) {
			array[i]=scan.nextInt();
		}
		LargestElement(array);
	}
	public static void LargestElement(int []array) {
		int max=Integer.MIN_VALUE;
		for(int i=0; i<array.length; i++) {
			if(array[i]>max) {
				max=array[i];
			}
		}
		System.out.print(max);
	}
}
