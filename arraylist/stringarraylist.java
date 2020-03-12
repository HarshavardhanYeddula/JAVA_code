package arraylist;

import java.util.ArrayList;

public class stringarraylist {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("hello");
        l.add("world");
        l.add("welcome");
        l.add("to");
        l.add("java");
        l.add("world");
        for(String  i: l){
            System.out.println(i+"");
        }
        System.out.println();
        System.out.println(l.isEmpty());
        l.set(1,"harsha");
        l.add("and python world");
        for(String  i: l){
            System.out.println();
            System.out.println(i+"");


        }
        System.out.println("index");
        System.out.println(l.indexOf("to"));
        System.out.println(l.indexOf("for"));
        System.out.println("delete");
        System.out.println(l.remove(3));

    }
}
