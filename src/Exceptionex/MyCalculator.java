package Exceptionex;

import java.util.Scanner;

public class MyCalculator {
   public static void main(String[] args) throws Exception {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter n value");
	   int n=sc.nextInt();
	   int[] base=new int[n];
	   int[] power=new int[n];
	   for (int i = 0; i < base.length; i++) {
		 System.out.println("enter a num");
		 int num=sc.nextInt();
		 base[i]=num;
	  }
	   for (int i = 0; i < power.length; i++) {
			 System.out.println("enter a num");
			 int num=sc.nextInt();
			 power[i]=num;
		  }
	   powerofbase(base,power);
	   
   }

private static void powerofbase(int[] base, int[] power) throws Exception {
	// TODO Auto-generated method stub
	int i,j;
	for ( i = 0; i < base.length; i++) {
		for ( j = 0; j < power.length; j++) {
			
				if(base[i]<0 && power[i]<0) {
					throw new Exception("base or power should not be negative");
				}
				if(base[i]==0 && power[i]==0) {
					throw new Exception("base or power should not be zero");
				}
			double result=Math.pow(base[i],power[i]);
			System.out.println(result);
		}
	}
}
}
