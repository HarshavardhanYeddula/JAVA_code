package practice;

import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = 1;
        int n = s.nextInt();
        while(row <= n){
            int   col = 1;
            while(col<=row){
                System.out.print("*");
                col++;
            }
            row++;
            System.out.println();
        }
    }

}
