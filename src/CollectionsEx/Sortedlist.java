package CollectionsEx;

import java.util.ArrayList;
import java.util.Collections;

public class Sortedlist {
   public static void main(String[] args) {
	   ArrayList<Integer> al=new ArrayList<>();
	   al.add(11);
	   al.add(2);
	   al.add(50);
	    
	   Collections.sort(al);
	   for(Integer i:al) {
		   System.out.println(i);
	   }
   }
}
