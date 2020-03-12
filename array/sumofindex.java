package array;

import java.util.Scanner;

public class sumofindex {
    public static void main(String[] args) {


        int[] a = {1, 2, 3, 4, 5, 6};
        Scanner s = new Scanner(System.in);
        int i1 = s.nextInt();
        int i2 = s.nextInt();
        int sum = a[i1] + a[i2];
        System.out.print(sum);
    }
}
