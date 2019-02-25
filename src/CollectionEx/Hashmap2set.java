package CollectionEx;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmap2set {
   public static void main(String[] args) {
	   HashMap<String, Integer> hm=new HashMap<String, Integer>();
	   hm.put("bob", 3);
	   hm.put("Alice", 4);
	   
	   HashSet<Integer> hs=new HashSet<>(hm.values());
	   System.out.println(hs);
   }
}
