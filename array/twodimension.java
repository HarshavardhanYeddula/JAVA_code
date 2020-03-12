package array;

import java.util.Scanner;

public class twodimension {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] ar = new int[2][2];
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {
              ar[i][j]=s.nextInt() ;
            }

        }
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j <ar[i].length ; j++) {
                System.out.print(ar[i][j]);
            }
            System.out.println();
        }
    }
}
