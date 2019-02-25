package CollectionEx;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetex2 {
    public static void main(String[] args) {
    	HashSet hs=new HashSet();
    	hs.add("Jaya");
    	hs.add(12);
    	hs.add(5);
    	hs.add(null);
    	
    	 Iterator<Integer> i=hs.iterator();
  	   while(i.hasNext()) {
  		   System.out.println(i.next());
  	   }

    	
    }
}
