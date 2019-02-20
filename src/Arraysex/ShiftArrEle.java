package Arraysex;

import java.util.Scanner;

public class ShiftArrEle {
	static Scanner sc=new Scanner(System.in);
	
   public static void main(String[] args) {
	   System.out.println("enter n");
	   int n=sc.nextInt();
	   int a[]=new int[n];
       shiftarre(a);
   }

private static void shiftarre(int[] a) {
	// TODO Auto-generated method stub
	int arr[]=new int[a.length];
	int j=0;
	int count=0;
	for (int i = 0; i < a.length; i++) {
		System.out.println("enter a num");
		int num=sc.nextInt();
		a[i]=num;
	}
	for (int i = 0; i < a.length; i++) {
	  if(a[i]==7) {
		count++;
	 }
	  else {
		  for ( j = 0; j < arr.length; j++) {
				
			}

	  }
	}
}
}
