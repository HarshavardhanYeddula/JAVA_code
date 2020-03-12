package lec2;

import java.util.Scanner;

public class patterntriangle {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int r = s.nextInt();
//        int c = s.nextInt();
        for (int i = 0; i <r ; i++) {
            for (int j =0; j <i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
//        System.out.println();
    }
}
