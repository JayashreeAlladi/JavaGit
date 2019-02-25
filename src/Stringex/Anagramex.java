package Stringex;

import java.util.Scanner;

public class Anagramex {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String s1=new String();
    	s1=sc.nextLine();
    	String s2=new String();
    	s2=sc.nextLine();
    	anagram(s1,s2);
    }

	private static void anagram(String s1, String s2) {
		// TODO Auto-generated method stub
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		int count=0;
		for (int i = 0; i < ch1.length; i++) 
		{
			for (int j = 0; j < ch2.length; j++) 
			{
				if(ch1[i]==ch2[j]) {
					count++;
				}
			}
		}
		if(count==ch1.length) {
			System.out.println("it is anagram");
		}

	}
}
