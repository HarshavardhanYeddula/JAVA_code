package strings;

import java.util.Scanner;

public class String_Builder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        StringBuilder s = new StringBuilder("hello");
//        s=scn.next();
        System.out.println(s.length());
        System.out.println(s.charAt(3));
//      string do not have setCharAt in string bulider we have



        s.setCharAt(3,'n');
        s.insert(3,'n');
        System.out.println(s);
        s.append('w');
        System.out.println(s.deleteCharAt(2));

        System.out.println(s);
        System.out.println(s.length());

        System.out.println("stringbulider to string ");
        String str = s.toString();
        System.out.println(str);
        System.out.println("string to stringbulider");
        String st = "world";
        StringBuilder s1= new StringBuilder(st);
        System.out.println("user input");
        Scanner n = new Scanner(System.in);
        String st1 = n.nextLine();
        StringBuilder s2 = new StringBuilder(st1);
        System.out.println(s2);
    }
}
