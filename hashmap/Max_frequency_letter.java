package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Max_frequency_letter {
    public static void main(String[] args) {
        String str="aabbab";
        Get_Max_Freq(str);
        System.out.println(Get_Max_Freq(str));
    }
    public static char Get_Max_Freq(String str){
        HashMap<Character,Integer> map =new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char cc = str.charAt(i);
            if(map.containsKey(cc)){
                int ov=map.get(cc);
                int nv = ov+1;
                map.put(cc,nv);
            }
            else{
                map.put(cc,1);
            }
        }
        char max_char='\0';
        int max=0;
        Set<Map.Entry<Character,Integer>> entries = map.entrySet();
        for (Map.Entry<Character,Integer> entry: entries){
            if (entry.getValue()>max){
                max=entry.getValue();
                max_char=entry.getKey();
            }
        }
return max_char;
    }
}
