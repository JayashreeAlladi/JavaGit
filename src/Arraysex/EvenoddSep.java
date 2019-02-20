package Arraysex;

import java.util.Arrays;
import java.util.Scanner;

public class EvenoddSep {
	static int count=0;
	static Scanner sc=new Scanner(System.in);
   public static void main(String[] args) {
	  
	   System.out.println("enter n");
	   int n=sc.nextInt();
	   int arr[]=new int[n];
	   evenoddsep(arr);
   }

private static void evenoddsep(int[] arr) {
	// TODO Auto-generated method stub
	
	int a[]=new int[count++];
	int b[]=new int[arr.length-count++];
	for (int i = 0; i < arr.length; i++) {
		System.out.println("enter a num");
		int num=sc.nextInt();
		arr[i]=num;
	}
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2==0) {
			count++; 
			for (int j = 0; j < a.length; j++) {
				a[j]=arr[i];
				System.out.println(a[j]);
			}
		}
	}
	Arrays.sort(a);
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2!=0) {
			for (int j = 0; j < b.length; j++) {
				b[j]=arr[i];
				System.out.println(b[j]);
			}
		}
	}
    Arrays.sort(a);
    merge(a,b);
}

private static void merge(int[] a, int[] b) {
	// TODO Auto-generated method stub
    int mer[]=new int[a.length+b.length];	
    for (int i = 0; i < a.length; i++) {
		count++;
		mer[i]=a[i];
	}
    
    for (int j = 0; j< b.length; j++) {
		mer[count++]=b[j];
	}
    for (int i = 0; i < mer.length; i++) {
		System.out.println(mer[i]);
	}
}
}
