package trees;

import java.util.Scanner;

public class binarytree {

    private Node root;

    public void insert(Scanner s) {
        this.root = insert(root, s);
    }

    private Node insert(Node node, Scanner s) {
        if (node == null) {
            System.out.println("enter the value :");
            int value = Integer.parseInt(s.nextLine());
            Node child = new Node(value);
            return child;
        }
        System.out.println("enter the direction: ");
        String dir = s.nextLine();
        if (dir.equals("left")) {
            node.left = insert(node.left, s);
        } else {
            node.right = insert(node.right, s);
        }
        return node;
    }

    public void display() {
        display(root, "");

    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }

    public int height() {
        return height(root);
    }

    private int height(Node node) {
        if (node == null) {
            return 0;
        }
        int max = Math.max(height(node.left), height(node.right));
//        return 1 + Math.max(height(node.left), height(node.right));
        return 1 + max;
    }

    public int diameter() {
        return diameter(root);
    }

    private int diameter(Node node) {
        if (node == null) {
            return 0;
        }
        int curremt = 1 + height(node.left) + height(node.right);
        int maxoftwo = Math.max(diameter(node.left), diameter(node.right));
        return Math.max(curremt, maxoftwo);
    }

    public boolean find(int value) {
        return find(root, value);
    }

    private boolean find(Node node, int value) {
        if (node == null) {
            return false;
        }
        if(node.value==value){
            return true;
        }
        return find(node.left,value) || find(node.right,value);

    }


    public class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

}
