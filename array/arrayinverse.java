package array;

import java.util.Scanner;

public class arrayinverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[3][3];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    public static void horizontal(int a[][]){
        for (int i = 0; i <a.length ; i++) {
            if(i%2==0){
                for (int j = 0; j <a[i].length ; j++) {
                    System.out.print(a[i][j]);

                }
            }
            else{
                for (int j = a[i].length-1; j>=0 ; j--) {
                    System.out.print(a[i][j]);

                }
            }
        }
    }
}
