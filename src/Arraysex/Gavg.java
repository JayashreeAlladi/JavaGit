package Arraysex;

import java.util.Scanner;

public class Gavg {
	static Scanner sc=new Scanner(System.in);
	
  public static void main(String[] args) {
	  System.out.println("enter n value");
	  int n=sc.nextInt();
	  int a[]=new int[n];
	
	  accarr(a);
  }

private static void accarr(int a[]) {
	// TODO Auto-generated method stub
	for(int i=0;i<a.length;i++) {
		  System.out.println("enter a num");
		  int num=sc.nextInt();
		  a[i]=num;
	  }
	 avg(a);
}

private static void avg(int[] a) {
	// TODO Auto-generated method stub
	int sum=0;
	double avg;
	for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];
	}
	avg=sum/a.length;
	for (int i = 0; i < a.length; i++) {
		if(a[i]>avg) {
			System.out.println(a[i]);
		}
	}
}
}
