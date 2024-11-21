package newJavaQn;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.nextLine();
		String str2=scan.nextLine();
		if(checkAnagram(str1,str2)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not a Anagram");
		}
	}
	public static boolean checkAnagram(String str1,String str2) {
		
		str1=str1.replaceAll("\\s", " ").toLowerCase();
		str2=str2.replaceAll("\\s", " ").toLowerCase();
		
		if(str1.length() != str2.length()) {
			return false;
		}
		char []ch1=str1.toCharArray();
		char []ch2=str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch1, ch2);
	}
}
