package Stringex;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Pangarams {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   
	   char ch[]=s.toCharArray();
	   HashSet<Character> h=new HashSet<>();
	   for(int i=0;i<ch.length;i++) {
		   h.add(ch[i]);
	   }
	   if(h.size()==27) // 26alphabets and one character in the given input is checked
	   {
		   System.out.println("pangaram");
	   }
	   else {
		   System.out.println("not a pangaram");
	   }
	   
   }
}
