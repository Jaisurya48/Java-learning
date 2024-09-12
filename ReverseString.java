package workout;

import java.util.Scanner;

public class ReverseString {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String t="";
		for(int i=s.length()-1; i>=0; i--) {
			t=t+s.charAt(i);
		}
		System.out.print(t);
	}
}
