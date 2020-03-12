package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Inbuilt_hashmap {
    public static void main(String[] args) {


        HashMap<String, Integer> h = new HashMap<>();
        h.put("USA", 300);
        h.put("UK",200);
        System.out.println(h);
        h.put("USA", 250);
//        System.out.println(h);
        h.put("USA", 330);
        System.out.println(h);
        System.out.println(h.remove("India"));
//        System.out.println(h.remove("USA"));
        System.out.println(h.containsKey("UK"));
        h.put("Africa", 250);
        h.put("India",350);
        System.out.println(h);


        System.out.println("**********Keys************");
        Set<String> keys= h.keySet();
        for (String key:keys) {
            System.out.println(key);
            
        }

        System.out.println("*********values***********");
        Collection<Integer> values = h.values();
        for (Integer value: values) {
            System.out.println(value);
        }


        System.out.println("*************key&value*************");
        Set<Map.Entry <String, Integer>> entries=h.entrySet();
        for (Map.Entry<String,Integer>  entry:entries){
            System.out.println(entry.getKey()+"==>"+entry.getValue());
            
        }

    }
}
