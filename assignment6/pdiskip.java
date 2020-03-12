package assignment6;

import java.util.Scanner;

public class pdiskip {
    public static void main(String[] args) {
        System.out.print("enter the number : ");
        Scanner s =  new Scanner(System.in);
        int n = s.nextInt();
        pdi(n);
    }
    public static void pdi(int n){
        if(n==0)
        {
            return;
        }
        if (n%2 == 1) {
            System.out.println(n);

        }
        pdi(n-1);
        if (n%2 == 0) {
            System.out.println(n);

        }
    }

}
