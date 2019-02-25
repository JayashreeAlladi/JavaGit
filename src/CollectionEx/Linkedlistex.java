package CollectionEx;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlistex {
    public static void main(String[] args) {
    	ArrayList<Integer> ll=new ArrayList<>();
    	ll.add(12);
    	ll.add(20);
    	ll.add(78);
    	for(int i=0;i<10e5;i++) {
    		ll.add(i);
    	}
    long start= System.currentTimeMillis();
    for(int i=0;i<10e5;i++) {
		ll.add(i);  //adding elements at the end.
	}
    long end=System.currentTimeMillis();
    System.out.println("time taken"+(end-start));
    
    }
}
