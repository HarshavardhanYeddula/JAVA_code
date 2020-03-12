package lec2;

import java.util.Scanner;

public class fibonaccipattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int len = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(fib(len));

            }

        }
    }

    public static int fib(int len) {
        int f1 = 0;
        int f2 = 1;
        int l=3;
        while ( l <= len + 2) {
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
            l = l + 1;
        }
        return f1;
    }
}


