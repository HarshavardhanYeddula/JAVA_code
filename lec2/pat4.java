package lec2;

import java.util.Scanner;

public class pat4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row =1;
        int count=1;
        while(row<=n){
            int col = 1;
            while(col<=row) {
//                int k = 0;
//                k = row+col-1;
//                System.out.print("  " + k + " ");
                System.out.print(count+" ");
                count++;
                col = col + 1;
            }
            System.out.println();
            row = row+1;
        }


    }
}
