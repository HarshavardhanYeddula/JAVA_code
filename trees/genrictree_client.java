package trees;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class genrictree_client {
    public static void main(String[] args) throws FileNotFoundException {
        genrictree t = new genrictree();
//        Scanner s = new Scanner(System.in);
        File input = new File("input1");
        Scanner s= new Scanner(input);
        t.insert(s);
        t.display();
        System.out.println();
        System.out.println("size of tree is : "+ t.count());
        System.out.println(t.maxnode());
        t.levelorder();
       t.depth(0);


    }
}

