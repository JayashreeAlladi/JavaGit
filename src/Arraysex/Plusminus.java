package Arraysex;
import java.util.Scanner;
public class Plusminus {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int a[]=new int[n];
	  for(int i=0;i<n;i++) {
		  System.out.println("enter a num");
		  int num=sc.nextInt();
		  a[i]=num;
	  }
	  plusminus(a);
	}

private static void plusminus(int[] a) {
	// TODO Auto-generated method stub
	 double pcount=0;
	 double ncount=0;
	 double zcount=0;
	 for (int i = 0; i < a.length; i++) 
	 {
	    if(a[i]<0)	{
            ncount++;	    	
	    }
	   if(a[i]>0) {
	    	pcount++;
	   }
	   if(a[i]==0) {
		   zcount++;
	   }
	    
	}
	 System.out.println(ncount/a.length);
	 System.out.println(pcount/a.length);
	 System.out.println(zcount/a.length);
}
}
