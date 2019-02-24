package Test;

import java.util.Scanner;

public class Marsmsg {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	String s=new String();
    	s=sc.nextLine();
    	marsmsg(s);
    }

	private static void marsmsg(String s) {
		// TODO Auto-generated method stub
		int i=1;
		int count=0;
		System.out.println(s.toUpperCase());
		char ch[]=s.toCharArray();
		char temp=s.charAt(0);
		char temp1=s.charAt(1);
		char temp2=s.charAt(2);
	
		for (i = 1; i <s.length()-2; i++) {
			if(ch[i]==temp) {
				
				if(ch[i+1]==temp1) {
					if(ch[i+1]==temp2) {
						
					}
					else {
						count++;
					}
				}
				else {
					count++;
				}
			}
			else {
				count++;
			}
		}
		System.out.println(count);
	}
}
