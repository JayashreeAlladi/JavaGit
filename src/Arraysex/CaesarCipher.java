package Arraysex;

import java.util.Scanner;

public class CaesarCipher {
   public static void main(String[]args) {
	   Scanner sc=new Scanner(System.in);
	   String s=new String();
	   s=sc.nextLine();
	   int n=sc.nextInt();
	   System.out.println(decmsg(encmsg(s,n),n));  
   }

private static StringBuilder decmsg(StringBuilder encmsg, int n) {
	// TODO Auto-generated method stub
	String msg=encmsg.toString();
	char[] letters=msg.toCharArray();
	StringBuilder decmsg=new StringBuilder();
	for(int i=0;i<letters.length;i++) {
		decmsg.append((char)(byte)(letters[i]-n));
	}
	return decmsg;
}

private static StringBuilder encmsg(String s, int n) {
	// TODO Auto-generated method stub
	char[] letters=s.toCharArray();// string s is converted to character array
	StringBuilder emsg=new StringBuilder();
	for(int i=0;i<letters.length;i++) {
		char ch=(char)((byte)s.charAt(i)+n);
		emsg.append(ch);
	}
	System.out.println(emsg);
	return emsg; 
	
}
}
