package loop;

import java.util.Scanner;

public class BricksGame {
	static Scanner sc=new Scanner(System.in);
	static int diff;

	 public static void main(String[] args) {
    	 int n=sc.nextInt();
    	 brickgame(n);
}

	private static void brickgame(int n) {
		// TODO Auto-generated method stub
		int p=0;int m=0;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			p=i;
			m=2*p;
			sum=sum+p+m;
		if(sum>=n) {
		  if((sum-m)>=n) {
			  System.out.println("patlu will take last brick");
			  break;
		  }
		  else {
			  System.out.println("motu will take last brick");
			  break;
		  }
		}
		}	
	}
}
