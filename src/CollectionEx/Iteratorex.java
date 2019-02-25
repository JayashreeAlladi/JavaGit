package CollectionEx;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorex {

      public static void main(String[] args) {
    	  ArrayList<Integer> al=new ArrayList<>();
   	   al.add(12);
   	   al.add(58);
   	   al.add(1);
   	   
   	   ArrayList<Integer> a=new ArrayList<>();
   	   a.add(0);
   	   a.add(5);
   	   a.addAll(al);
   	   
   	   System.out.println(a);
   	   
   	   Iterator<Integer> iterator=al.iterator();
    	  
} 
}