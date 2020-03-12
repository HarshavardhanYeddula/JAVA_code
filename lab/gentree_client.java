package lab;

import java.util.Scanner;

public class gentree_client {
    public static void main(String[] args) {
                gentree tree = new gentree();
        Scanner s = new Scanner(System.in);
        tree.insrt(s);
        tree.display();
        System.out.println("max element :"+tree.maxi());
        System.out.println("size of tree : "+tree.count());
    }
}

//true
//false