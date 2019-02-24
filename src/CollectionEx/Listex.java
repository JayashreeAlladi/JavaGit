package CollectionEx;

import java.awt.List;
import java.util.ArrayList;

public class Listex {
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
	   System.out.println(a.get(2));
   }
}
