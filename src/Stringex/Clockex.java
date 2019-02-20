package Stringex;

import java.util.Scanner;

public class Clockex {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a string");
	  String s=new String();
	  s=sc.nextLine();
	  String str[]=s.split(":");int i;
	  for (i = 0; i < str.length; i++) {
		System.out.println(str[i]);
	
	  }
	  
	  if((str[2].substring(2,3))=="PM") {
		  if(str[0]=="12") {
			  System.out.println(Integer.parseInt(str[0])+0);
		  }
		  else {
			  System.out.println(Integer.parseInt(str[0])+12);
		  }
	  }
	  else {
		  if(str[0]=="12") {
			  System.out.println(Integer.parseInt(str[0])-12);
		  }
		  else {
			  System.out.println(Integer.parseInt(str[0])+0);
          
		  }
	  }
	  
   }
}
