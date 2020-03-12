package lec2;

import java.util.Scanner;

public class pat2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int col = 1;
        int space = 1;
      /*  while(space<=n-row) {
            System.out.println(" ");
            space = space + 1;
        }
        while(col<=2*row-1){
            System.out.print("*");
            col=col+1;
            }
        System.out.println();
          row=row+1;
        }
    }*/
        while (row <= n) {
            space = 1;
            while (space <= n - row) {
                System.out.print(" ");
                space = space + 1;
            }
            col = 1;
            while (col <= 2 * row - 1) {
                System.out.print("*");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}