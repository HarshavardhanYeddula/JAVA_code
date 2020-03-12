package lec2;

import java.util.Scanner;

public class fibonac {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n  = s.nextInt();
        int fact = 1;
        if(n<0){
            System.out.println("invalid input");
        }
        else{
            for (int i = 1; i <=n ; i++) {

                fact=fact*i;

            }
            System.out.println(fact);
        }
    }
}
