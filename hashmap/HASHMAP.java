package hashmap;

import java.util.HashMap;
import java.util.Map;

public class HASHMAP {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("hash", "map");
//        System.out.println(map.toString());
        System.out.println(map);
        for (String key : map.keySet()) {
            System.out.println(key);

        }
        System.out.println();
        for (String values : map.values()) {
            System.out.println(values);

        }
        System.out.println(map.containsKey("a"));
    }
        public Map<Character,Integer>freq(String str){
        Map<Character,Integer> map=new HashMap<>();
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if (map.containsKey(ch)){
                    map.put(ch,map.get(ch+1));
                }
                else{
                    map.put(ch,1);
                }
        }
            return map;
    }


}
