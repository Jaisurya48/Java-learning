package newJavaQn;

import java.util.Scanner;

public class PalindromicString {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		String Res=palindrome(s);
		if(s.equals(Res)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
	public static String palindrome(String s) {
		String temp="";
		for(int i=s.length()-1;i>=0;i--) {
			temp=temp+s.charAt(i);
		}
		return temp;
	}
}
