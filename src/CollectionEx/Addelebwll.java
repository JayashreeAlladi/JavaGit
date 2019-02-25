package CollectionEx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Addelebwll {
	public static void main(String[] args) {
    	LinkedList<Integer> ll=new LinkedList<>();
    	ll.add(12);
    	ll.add(20);
    	ll.add(78);
    	Iterator<Integer> i=ll.iterator();
    	addelebw(ll) ;       
}

	private static int addelebw(LinkedList<Integer> ll) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
    		ll.add(i);
    	}
     
		return ll.size()/2;
	}
}