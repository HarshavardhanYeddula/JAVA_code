package assignment6;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner s =  new Scanner(System.in);
        System.out.print("enter the number: ");
        int x = s.nextInt();
        System.out.print("enter the power: ");
        int n = s.nextInt();

        pow(x,n);
        System.out.println(pow(x,n));
//        fact(n);
//        System.out.println(fact(n));
    }
    public static int  fact(int n){
        if (n == 1) {
            return 1;
            }
        int fnm1 = fact(n-1);
        int fn = n*fnm1;
        return fn;
    }
    public static int pow(int x,int n){
        if (n == 0) {
            return 1;
        }
        int pnm1 = pow(x,n-1);
        int p = x*pnm1;
        return p;
    }
}
