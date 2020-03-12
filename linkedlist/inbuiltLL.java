package linkedlist;

import java.util.LinkedList;

public class inbuiltLL {
    public static void main(String[] args) {
        LinkedList<String> object = new LinkedList<String>();
        object.add("a");
        object.add("b");
        object.addFirst("1");
        object.addLast("c");

        System.out.println(object);
        object.add("A");
        object.add("B");
        object.addFirst("@");
        object.addLast("D");
        System.out.println(object);
        boolean status = object.contains("sh");
        if(status){
            System.out.println("contains");
        }
        else{
            System.out.println("not contains");

        }
        object.remove("b");

    }
}
