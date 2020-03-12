package lec2;

import java.util.Scanner;

public class patternsquare {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int r = s.nextInt();
//        int c = s.nextInt();
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <r ; j++) {
                System.out.print(" "+"*"+" ");

            }
            System.out.println();
        }
    }
}
