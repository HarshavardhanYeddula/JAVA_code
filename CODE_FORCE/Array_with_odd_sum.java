package CODE_FORCE;

import java.util.Scanner;

public class Array_with_odd_sum {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
//        System.out.println("Enter the number of arrays to be used: ");
//        int n = s.nextInt();
        System.out.println("Enter the size of arrays : ");
        int size=s.nextInt();
        int[] a =new int[size];
        int sum = 0;

        for (int i = 0; i <size ; i++) {
            System.out.print("Enter the elements at "+i+"th position :");
        a[i]=s.nextInt();
            System.out.println();
        }
        for (int j = 0; j <size ; j++) {

            sum=sum+a[j];

        }
        if (sum % 2 == 0) {
            System.out.println("NO");
        }
        else{
            System.out.println("Yes");
        }
    }
}
