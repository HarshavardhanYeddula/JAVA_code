package array;

import java.util.Scanner;

public class additionofelement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a =  new int[50];
        System.out.print("enter number of elements :");
        int size = s.nextInt();
        for (int i = 0; i < size ; i++) {
            a[i]=s.nextInt();
        }
    }
}
