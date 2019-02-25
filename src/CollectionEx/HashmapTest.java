package CollectionEx;

import java.util.HashMap;
import java.util.Map;

public class HashmapTest {
	public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("code", 10);
      //  map.put("to", 11);
      //  map.put("joy", 12);

     //   if (! map.isEmpty()) {
            Map.Entry<String, Integer> entry = map.entrySet().iterator().next();
            System.out.println(entry);
      //  }
    }

}
