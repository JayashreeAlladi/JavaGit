package files;

import java.util.Scanner;

public class CaisercipherFileIOs {
	 public static void main(String[]args) {
		   Scanner sc=new Scanner(System.in);
		   String s=new String();
		   s=sc.nextLine();
		   int n=sc.nextInt();
		   System.out.println(decmsg(encmsg(s,n),n));  
	   }

	private static char[] decmsg(Object encmsg, int n) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Object encmsg(String s, int n) {
		// TODO Auto-generated method stub
		try {
			
		}
		catch(Exception e) {
			
		}
		return null;
	}

}
