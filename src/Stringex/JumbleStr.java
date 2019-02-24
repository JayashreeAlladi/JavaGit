package Stringex;

import java.util.Scanner;

public class JumbleStr {
	static Scanner sc=new Scanner(System.in);
	
  public static void main(String[] args) {
	  String s1=new String();
	  String s2=new String();
	  jumbleletters(s1,s2);
  }

private static void jumbleletters(String s1, String s2) {
	// TODO Auto-generated method stub
	s1=sc.nextLine();
	s2=sc.nextLine();
//without storing jumble of two strings we directly print them
	if(s1.length()==s2.length()) {
	 for (int i = 0; i < s1.length(); i++) {
		char ch1=s1.charAt(i);
		char ch2=s2.charAt(i);
		System.out.print(ch1);
		System.out.print(ch2);
	  }
	}
	
}
}