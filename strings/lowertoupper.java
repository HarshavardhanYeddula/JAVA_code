package strings;

import java.util.Scanner;

public class lowertoupper {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String  s= n.nextLine();
        toggle(s);
    }
    public static void toggle(String s){
        StringBuilder b = new StringBuilder(s);
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                ch=(char)(ch-32);
            }
            else{
                System.out.println("invalid");
            }
            b.setCharAt(i,ch);
        }
        System.out.println(b);
    }
}
