package lec2;

import java.util.Scanner;

public class pat1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int row = 1;
        int col = 1;
        while(row<=n){
            col = 1;
            while(col<=row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row++;
            }
        }
    }
