package array;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        int ar[]= new int [5];
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);
        int a=list.indexOf(3);
        System.out.println(list.get(2));
        System.out.println(ar);
        System.out.println(list);
        System.out.println(a);
    }
}
