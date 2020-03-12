package practice;

import java.util.Arrays;
import java.util.Scanner;

public class arraysort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            System.out.println(Arrays.toString(a));
        }


        int[] b = new int[n];
        for (int j = 0; j < n; j++) {
            b[j] = s.nextInt();
            System.out.print(Arrays.toString( b));
        }
        int[] c = new int[n + n];


        System.out.println(Arrays.toString(c));
    }
}
