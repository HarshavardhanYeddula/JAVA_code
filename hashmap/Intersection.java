package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Intersection {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 9, 20};
        int[] b = {3, 7, 4, 1, 6, 2, 10, 11};

        ArrayList<Integer> list = getIntersection(a, b);
        System.out.println(getIntersection(a,b));
    }

    public static ArrayList<Integer> getIntersection(int[] a, int[] b) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <a.length; i++) {
            map.put(a[i],false);
        }
        for (int j = 0; j <b.length ; j++) {
            if (map.containsKey(b[j])){
                map.put(b[j],true);
            }

        }
        Set<Map.Entry<Integer,Boolean>> entries = map.entrySet();
        for (Map.Entry<Integer,Boolean> entry: entries) {
            if(entry.getValue()){
                list.add(entry.getKey());
            }
            
        }
        return list;
    }
}
