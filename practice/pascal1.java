package practice;

import java.util.Scanner;

public class pascal1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ncr(i, j) + " ");

            }
            System.out.println();
        }
    }

    public static int ncr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    public static int fact(int n) {
        int f = 1;
        while (n > 0) {
            f = f * n;
            n--;

        }
        return f;
    }
}
