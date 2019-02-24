package CollectionEx;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListorNot {
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 ArrayList<Integer> al=new ArrayList<>();
    	 
    	 for(int i=0;i<5;i++) {
    		 int n=sc.nextInt();
    	    al.add(n);
    	 }
    	 int test=sc.nextInt();
    	 for(int i=0;i<5;i++) {
    		 if(al.get(i)==test) {
    			 System.out.println("element found");
    		 }
    	 }
     }
}
