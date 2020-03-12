package lab;

import java.util.ArrayList;
import java.util.Scanner;

public class gentree {
    private Node head;

    //inserting the elements in treee

    public void insrt(Scanner s) {
        System.out.println("enter the value: ");
        int x = s.nextInt();
        this.head = new Node(x);
        insrt(s, head);
    }

    public void insrt(Scanner s, Node node) {
        while (true) {
            System.out.println("do you want add child :" + node.value);
            boolean yes = s.nextBoolean();
            if (yes) {
                System.out.println("enter the value");
                int y = s.nextInt();
                Node child = new Node(y);
                node.children.add(child);
                insrt(s, child);
            } else {
                break;
            }
        }
    }

    //displaying treee in order

    public void display(){
        display(head,"");
    }
    private void display(Node node,String indent){
        System.out.println(indent + node.value);
        for (int i = 0; i <node.children.size() ; i++) {
            display(node.children.get(i),indent + " ");
        }
    }


    public int count(){
        return count(head);

    }
    private int count(Node node){
        int cou = 1;
        for (int i = 0; i <node.children.size() ; i++) {
            cou+=count(node.children.get(i));

        }
        return cou;
    }
    public int maxi(){
        int max= head.value;
        return maxi(max,head);
    }
    private int maxi(int max,Node node){
        if (max<node.value){
            max=node.value;
        }
        for (int i = 0; i <node.children.size() ; i++) {
            max=maxi(max,node.children.get(i));

        }
        return max;
    }







    class Node {
        private int value;
        private ArrayList<Node> children;


        public Node(int values) {
            this.value = values;
            this.children = new ArrayList<>();
        }

    }
}


