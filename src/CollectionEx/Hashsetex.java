package CollectionEx;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetex {
   public static void main(String[] args) {
	   HashSet<Integer> h=new HashSet<>();
	   
	   h.add(10);
	   h.add(4);
	   h.add(null);
	   h.add(24);
	   h.add(10);  // it does not allow duplication
	   h.add(null);//hashset accepts only one null value
	   
	   Iterator<Integer> i=h.iterator();
	   while(i.hasNext()) {
		   System.out.println(i.next());
	   }
   }
}
