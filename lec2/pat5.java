package lec2;

import java.util.Scanner;

public class pat5 {
    public static void main(String[] args) {
        int row = 1;

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        n=2*n-1;
        int k=1;
        while (k <= n) {
            int col = 1;

            while (col <= row) {
                    System.out.print( "*");



             col++;
            }
            if(k<=n/2)
            {
                row++;
            }
            else {
                row--;
            }
            System.out.println();

             k=k+1;
        }

    }
}
