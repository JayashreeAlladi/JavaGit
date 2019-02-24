package Stringex;

import java.util.Scanner;

public class Jumblestrbuilder {
	static Scanner sc=new Scanner(System.in);
	
	  public static void main(String[] args) {
		  String s1=new String();
		  String s2=new String();
		  System.out.println(jumbleletters(s1,s2));

}

	private static StringBuilder jumbleletters(String s1, String s2) {
		// TODO Auto-generated method stub
		s1=sc.nextLine();
		s2=sc.nextLine();
		char[] letters1=s1.toCharArray();
		char[] letters2=s2.toCharArray();
		StringBuilder jumblestr=new StringBuilder();
		return jumblestr;

	}
}
