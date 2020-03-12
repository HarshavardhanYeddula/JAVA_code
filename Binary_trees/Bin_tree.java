package Binary_trees;

import java.util.LinkedList;
import java.util.Scanner;

public class Bin_tree {
    public class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    private Node root = null;
    private int size = 0;

    Bin_tree() {
        Scanner s = new Scanner(System.in);
        this.root = takeInput(s, null, false);
    }

    public Node takeInput(Scanner s, Node parent, boolean isleftorisright) {
        if (parent == null) {
            System.out.println("Root node:");
        } else {
            if (isleftorisright) {

                System.out.println("Enter left child : " + parent.data);
            } else {
                System.out.println("Enter right child : " + parent.data);
            }

        }
        int nodeData = s.nextInt();
        Node node = new Node(nodeData, null, null);
        this.size++;

        boolean choice = false;
        System.out.println("Do u want to enter left child for root node: " + nodeData);
        choice = s.nextBoolean();


        if (choice) {
            node.left = takeInput(s, node, true);
        }
        choice = false;
        System.out.println("Do u want to enter right child for root node: " + nodeData);
        choice = s.nextBoolean();


        if (choice) {
            node.right = takeInput(s, node, true);
        }
        return node;
    }


    public void display() {
        this.display(this.root);
    }

    private void display(Node node) {
        String str = "";
        if (node.left != null) {
            str = str + node.left.data + "=>";
        } else {
            str = str + "end=>";
        }
        str = str + node.data;
        if (node.right != null) {
            str = str + "<=" + node.right.data;
        } else {
            str = str + "<=end";
        }
        System.out.println(str);
        if (node.left != null) {
            this.display(node.left);
        }
        if (node.right != null) {
            this.display(node.right);
        }
    }


    public int height() {
        return this.height(this.root);
    }

    private int height(Node node) {
        if (node == null) {
            return -1;
        }
        int lheight = this.height(node.left);
        int rheight = this.height(node.right);
        int height = Math.max(lheight, rheight) + 1;
        return height;

    }


//    Preorder traversal
//              50
//             /   \
//            25    45
//           /  \   /   \
//}         38  48  85  60
//                /
//               18


//    Preorder traversal
//            rule:
//                1.Node,
//                2.Left child;
//                3.Right child;
//     preorder output of the tree : 50->25->38->48->18->45->85->60


    public void Preorder(){
        this.Preorder(this.root);
        System.out.print("END");
    }
    private void Preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+", ");
        Preorder(node.left);
        Preorder(node.right);

    }


//    Postorder traversal
//     Rule:
//          1.Left child
//          2.Right child
//          3.Node
    public void Postorder(){
        this.Postorder(this.root);
        System.out.print("END");
    }
    private void Postorder(Node node){
        if (node==null){
            return;
        }
        Postorder(node.left);
        Postorder(node.right);
        System.out.print(node.data+", ");
    }

    //    Inorder traversal
//            rule:
//                    1.left subtree
//                    2.Node
//                    3.Right subtree
    public void Inorder(){
        this.Inorder(this.root);
        System.out.print("END");
    }
    private void Inorder(Node node){
        if (node==null) {
            return;
        }
        Inorder(node.left);
        System.out.print(node.data+", ");
        Inorder(node.right);

        }

        public void Levelorder(){
            LinkedList<Node> queue = new LinkedList<>();
            queue.add(this.root);
            while (!queue.isEmpty()){
                Node rv=queue.removeFirst();
                System.out.print(rv.data+", ");

                if (rv.left!=null){
                    queue.addLast(rv.left);
                }
                if(rv.right!=null){
                    queue.addLast(rv.right);
                }
            }
            System.out.println("End");
        }



        public boolean IsBST(){
            return this.IsBST(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
        private boolean IsBST(Node node,int min,int max){
        if (node==null){
            return true;
        }

            if (node.data>max|| node.data<min){
                return false;
            }

            else if (!this.IsBST(node.left,min,node.data)){
                return false;
            }

            else if (!this.IsBST(node.right,node.data,max)){
                return false;
            }
            return true;
        }
}
