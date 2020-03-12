package strings;

import java.util.Scanner;

public class diiference {
    public static void main(String[] args) {
            String s ="ac";
        diff(s);
        System.out.println(diff(s));
    }
    public static StringBuilder diff(String s){
        StringBuilder b = new StringBuilder();

//           take empty builder
        b.append(s.charAt(0));

        for(int i = 1;i<s.length();i++){
            char ch = s.charAt(i);
            char ch1 = s.charAt(i-1);
            int diff = Math.abs(ch-ch1);
            b.append(diff);
            b.append(ch);
        }
        return b;
    }
}
