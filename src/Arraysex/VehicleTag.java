package Arraysex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VehicleTag {
	static Scanner sc=new Scanner(System.in);
	
   public static void main(String[] args) {
	      String s=new String();
	      s=sc.nextLine();
	      tagidentify(s);
   }

private static void tagidentify(String s) {
	// TODO Auto-generated method stub
	
	char ch[]=s.toCharArray();
  if(((ch[0]+ch[1])%2==0)&&((ch[0]+ch[1])%2==0)) {
    if(((ch[3]+ch[4])%2==0)&&((ch[4]+ch[5])%2==0)) {
	 if(((ch[5]+ch[7])%2==0)&&((ch[7]+ch[8])%2==0)) {
        if((ch[2]!='A') || (ch[2]!='E')|| (ch[2]!='I') || (ch[2]!='O') || (ch[2]!='U')) {
           if(ch[6]=='-') {
        	   System.out.println("valid");
           }
        }
      }
    }
  }
  else {
	  System.out.println("not valid");
  }
}
}
