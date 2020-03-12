package trees;

import java.util.Scanner;

public class binarytree_client {
    public static void main(String[] args) {
        binarytree binary=new binarytree();
        Scanner s = new Scanner(System.in);
        binary.insert(s);
        binary.insert(s);
        binary.insert(s);
        binary.insert(s);
        binary.insert(s);
        binary.insert(s);
        binary.display();
        System.out.println();
        System.out.println("max height : "+binary.height());

        System.out.println("diameter of a tree  : "+binary.diameter());
    }
}
