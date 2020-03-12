package assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        int[] a = {1, 2, 3, 4};
        int[] b = {6, 7, 9};
        int al = a.length;
        int bl = b.length;
        int[] c = new int[al + bl];
        System.arraycopy(a, 0, c, 0, al);
        System.arraycopy(b, 0, c, al, bl);
        System.out.println(Arrays.toString(c));
        System.out.println(sorted(c, 0));
    }

    public static boolean sorted(int c[], int index) {

        if (index == c.length - 1) {
            return true;
        }

        if (c[index] > c[index + 1]) {
            return false;
        }

        return sorted(c, index + 1);
    }

}
