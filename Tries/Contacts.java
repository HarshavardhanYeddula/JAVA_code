package Tries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Contacts {
    public class Node {
        char data;
        HashMap<Character, Node> children;
        boolean isTerminal;


        Node(char data, boolean isTerminal) {
            this.data = data;
            this.children = new HashMap<>();
            this.isTerminal = isTerminal;
        }
    }

    private int numword;
    private Node root;

    Contacts() {
        this.root = new Node('\0', false);
        this.numword = 0;
    }

    public int numword() {
        return this.numword();
    }

    public void add_word(String word) {
        this.add_word(this.root, word);
    }

    private void add_word(Node parent, String word) {
        if (word.length() == 0) {
            if (parent.isTerminal) {
//            word already exists
            } else {
                parent.isTerminal = true;
                this.numword++;
            }
            return;
        }


        char cc = word.charAt(0);
        String ros = word.substring(1);
        Node child = parent.children.get(cc);
        if (child == null) {
            child = new Node(cc, false);
            parent.children.put(cc, child);
        }
        this.add_word(child, ros);
    }


    public void display() {
        this.display(this.root,"");
    }

    private void display(Node node, String osf) {

    if (node.isTerminal){
         String todisplay=osf.substring(1)+node.data;
         System.out.println(todisplay);
}

        Set<Map.Entry<Character,Node>> entries=node.children.entrySet();
        for (Map.Entry<Character,Node> entry:entries){
            this.display(entry.getValue(),osf+node.data);
        }

    }


    public boolean search(String word){
       return this.search(this.root,word);
    }

    private boolean search(Node parent,String word){

        if (word.length() == 0) {
            if (parent.isTerminal) {
                return true;
            } else {
                return false;
            }
        }

        char cc = word.charAt(0);
        String ros = word.substring(1);
        Node child = parent.children.get(cc);
        if (child == null) {
            return false;
        }
    return this.search(child,ros);
    }


}

