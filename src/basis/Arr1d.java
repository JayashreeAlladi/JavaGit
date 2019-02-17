package basis;

import java.util.Scanner;

public class Arr1d {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int accNo[]= new int[5];
	   for (int i = 0; i < accNo.length; i++) {
			System.out.println("enter number");
			int num=sc.nextInt();
			accNo[i]=num;
	   }
	   for (int i = 0; i < accNo.length; i++) {
			System.out.println(accNo[i]);
			
	   }
	   
   }
}
