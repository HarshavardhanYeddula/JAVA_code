package practice;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("enter the number");
        int s = n.nextInt();
        int div = 2;
        boolean flag = true;
        while (div <= s - 1) {
            if (s % div == 0) {
                flag = false;
            }
           div= div+1;
        }
        if(flag==true){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
}