package newJavaQn;

import java.util.Scanner;

public class ReplaceCharcters {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		char ch1=scan.next().charAt(0);
		char ch2=scan.next().charAt(0);
		
		String Res=s.replace(ch1,ch2);
		System.out.println(Res);
	}
}
