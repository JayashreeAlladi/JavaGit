package CollectionEx;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetex {
  public static void main(String[] args) {
	  TreeSet<Integer> t=new TreeSet<>();
	  
	  t.add(20);
	 // t.add(null); 
	  //treeset does not accept null values. Since it prints output in order.
	  t.add(10);
	  t.add(0);
	  
	  Iterator<Integer> i=t.iterator();
	  while(i.hasNext()) {
		  System.out.println(i.next());
	  }
  }
}
