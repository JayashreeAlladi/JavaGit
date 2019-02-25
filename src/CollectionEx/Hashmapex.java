package CollectionEx;

import java.util.HashMap;
import java.util.Map;

public class Hashmapex {
   public static void main(String[] args) {
	   HashMap<Integer, String> h=new HashMap<>();
	   h.put(100, "Jaya");
	   h.put(101, "Ram");
	   h.put(102, "Sohan");
	   
	   for(Map.Entry m:h.entrySet()) {
		   System.out.println(m.getKey()+" "+m.getValue());
	   }
   }
}
