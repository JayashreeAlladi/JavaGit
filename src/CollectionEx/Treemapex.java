package CollectionEx;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemapex {
    public static void main(String[] args) {
    	 TreeMap<Integer, String> t=new TreeMap<>();
  	   t.put(100, "Jaya");
  	   t.put(101, "Ram");
  	   t.put(102, "Sohan");
  	   
  	   for(Map.Entry m:t.entrySet()) {
  		   System.out.println(m.getKey()+" "+m.getValue());
  	   }
    }
}
