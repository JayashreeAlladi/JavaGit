package CollectionEx;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableinterrfaceEx {
   public static void main(String[] args) {
	   ArrayList<Students> al=new ArrayList<Students>();
	   al.add(new Students(1,"Jaya",21));
	   al.add(new Students(2,"Bob",20));
	   al.add(new Students(3,"ram",24));
	    
	   Collections.sort(al);
	   for(Students st:al) {
		   System.out.println(st.rollno+" "+st.name+" "+st.age);
	   }
   }
}
