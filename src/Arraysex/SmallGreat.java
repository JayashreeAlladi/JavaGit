package Arraysex;

import java.util.Arrays;
import java.util.Scanner;

public class SmallGreat {
	
   public  static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter kth value");
	 int k=sc.nextInt();
	 System.out.println("enter size");
	 int size=sc.nextInt();
	 int a[]=new int[size];
	 
	 for(int i=0;i<a.length;i++) {
		 System.out.println("enter a num");
		 int num=sc.nextInt();
		 a[i]=num;
	 }
	 
	 small(a,k);
	  great(a,k);
   }

private static void great(int[] a, int k) {
	// TODO Auto-generated method stub
	Arrays.sort(a);
	for (int i = 0; i < a.length; i++) {
		if(i==a.length-k) {
			System.out.println(a[i]);
		}
	}
	
}

private static void small(int[] a,int k) {
	// TODO Auto-generated method stub
	Arrays.sort(a);
	for (int i = 0; i < a.length; i++) {
		if(i==k-1) {
			System.out.println(a[i]);
		}
	}

}


}
