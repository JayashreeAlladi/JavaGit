package packageex;

import java.util.Scanner;

public class Rightri {
	 static int x,y;
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the lengths of  right angle triangle");
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   int c=sc.nextInt();
	   
	   x=square(a);
	   y=square(b);
	   int result= x+y;
	   System.out.println(Math.sqrt(result));
	   if(c==Math.sqrt(result)) {
		   System.out.println("It is a right angle triangle");
	   }
	   
   }

private static int square(int a) {
	// TODO Auto-generated method stub
	x= a*a;
	return x;
}
  
}
