package assignment6;


import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(fib(n));

    }
    public static int fib(int n){
        if (n == 0) {
            return n;

        }
        if(n==1){
            return n;
        }


        int fib1 = fib(n-1);
        int fib2 = fib(n-2);
        int f =  fib1+fib2;
        return f;


    }
}
