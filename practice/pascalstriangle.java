package practice;

import java.util.Scanner;

public class pascalstriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(pas(i, j));
            }
            System.out.println();
        }
    }
    public static int pas(int n, int r) {
        return pasc(n) / (pasc(r) * (pasc(n-r)));
    }
    public static int pasc(int n) {
        int f = 1;
        while (n > 0) {
            f = f * n;
            n--;
        }
        return f;
    }
}
