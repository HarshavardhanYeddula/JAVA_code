package practice;

import java.util.Scanner;

public class recrussion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n =s.nextInt();
        flow(n);

    }
    public static void flow(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        flow(n-1);
        System.out.println(n);
    }
}
