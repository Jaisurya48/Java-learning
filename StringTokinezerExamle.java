package workout;

import java.util.*;
public class StringTokinezerExamle {
	public static void main(String[] args) {
		StringTokenizer st=new StringTokenizer("Java Html Css Javascript Sql Datastructures Collections", " ");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
