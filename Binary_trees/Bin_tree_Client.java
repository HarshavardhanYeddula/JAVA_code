package Binary_trees;

import java.util.LinkedList;

public class Bin_tree_Client {
    public static void main(String[] args) {
        Bin_tree tr = new Bin_tree();
        tr.display();
        System.out.println("height of the tree");


        System.out.println(tr.height());


        System.out.println("Preorder traversal of a tree ");


        tr.Preorder();
        System.out.println();
        System.out.println("Postorder");
        tr.Postorder();
        System.out.println();

        System.out.println("Inorder");
        tr.Inorder();
        System.out.println();
        System.out.println("Levelorder");
        tr.Levelorder();


        System.out.println("Is this tree is BST or NOT");

        System.out.println(tr.IsBST());
//        50 true 25 true 38 false false true 32 true 27 false false false true 55 true 43 false false true 60 false false
// binary tree
//        50 true 25 true 20 false false true 32 true 27 false false false true 55 true 43 false false true 60 false false

    }


}
