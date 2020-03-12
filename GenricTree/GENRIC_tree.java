package GenricTree;

import java.util.ArrayList;
import java.util.Scanner;

public class GENRIC_tree
{
    private class Node{
        int data;
        ArrayList<Node> children;
        Node(int data ){
            this.data=data;
            this.children=new ArrayList<>();
        }
    }
    private int size;
    private Node root;


    GENRIC_tree(){
        Scanner s = new Scanner(System.in);
        this.root=takeInput( s,null,0);

    }
    private Node takeInput(Scanner s,Node parent,int i_th_child){
            if(parent==null){
                System.out.println("Enter the Elements to the Tree :");
            }
            else{
                System.out.println("Enter the data for the"+i_th_child+ "th child of"+parent.data);
            }
            int nodedata=s.nextInt();
            Node node= new Node(nodedata);
            this.size++;

            System.out.println("Enter number of Childrens to the Root Node:  ");
            int children = s.nextInt();


            // will be executed according to the given input
        for (int i = 0; i <children ; i++) {
            Node child=this.takeInput(s,node,i);
            node.children.add(child);

        }
        return node;
    }

    public void display(){
        this.display(this.root);
    }
    private void display(Node node){
        //node data
        String str = node.data+"=>";
        for (int i = 0; i <node.children.size() ; i++) {
            // adding children data current node
            str=str+node.children.get(i).data+", ";
        }
        str = str+"END";
//        System.out.println(str);
        //display the string of current node
        System.out.println(str);
        // display for all nodes
        for (int i = 0; i <node.children.size() ; i++) {
            this.display(node.children.get(i));

        }
    }
}
