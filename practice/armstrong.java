package practice;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("print the number:");
        double n = s.nextInt();
        System.out.print("number of digits: ");
        int digits = s.nextInt();
        double arm = armstrong(n, digits);
        System.out.println(arm);
    }


    public static double armstrong(double n, int digits) {
        double rem = 0;
         double arm = 0;
        while (n != 0) {
            rem = n % 10;
            n = n / 10;
         arm =  (arm + Math.pow(rem, digits));

        }
        if(arm==n)
        {
            System.out.println("it is a armstrong number ");
        }
        else{
            System.out.println("it is not a armstrong number");
        }
            return arm;

    }
}