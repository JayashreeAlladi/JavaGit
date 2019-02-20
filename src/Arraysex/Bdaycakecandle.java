package Arraysex;

import java.util.Scanner;

public class Bdaycakecandle {
	static int candleblown=0;
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter your age");
	  int age=sc.nextInt();
	  int candles[]=new int[age];
	  for (int i = 0; i < candles.length; i++) {
		System.out.println("enter a num");
		int num=sc.nextInt();
		candles[i]=num;
	}
	  birthdayCakeCandles(candles);
	  System.out.println(candleblown);
  }

private static int birthdayCakeCandles(int[] candles) {
	// TODO Auto-generated method stub
	int max=candles[0];
	for(int i=0;i<candles.length;i++) {
	 if(candles[i]>max) {       // values in candles array checked with max
		 max=candles[i];
	 }
	 if(candles[i]==max) {
		       candleblown++;
	 }
	}
	return candleblown;
}
}
