package Arraysex;

import java.util.Arrays;
import java.util.Scanner;

public class Merge2arr {
	static Scanner sc=new Scanner(System.in);
	
	   public static void main(String[] args) {
		   System.out.println("enter n");
		   int n=sc.nextInt();
		   int m=sc.nextInt();
		   int a[]=new int[n];
		   int b[]=new int[m];
		   int mer[]=new int[a.length+b.length];
		   arrdef(a,b,mer);
    }

	private static void arrdef(int[] a, int[] b, int[] mer) {
		// TODO Auto-generated method stub
		int count=0;
		for (int i = 0; i < a.length; i++) {
			System.out.println("enter a num");
			int num=sc.nextInt();
			a[i]=num;
		}
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			count++;
			mer[i]=a[i];
		}

		for (int j = 0; j< b.length; j++) {
			System.out.println("enter a num");
			int num=sc.nextInt();
			b[j]=num;
		}
		Arrays.sort(b);
		for (int j = 0; j< b.length; j++) {
			mer[count++]=b[j];
		}
		Arrays.sort(mer);
		for (int i = 0; i < mer.length; i++) {
			System.out.println(mer[i]);
		}
		
	}

}
