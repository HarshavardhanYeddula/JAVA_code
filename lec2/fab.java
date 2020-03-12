package lec2;

import java.util.Scanner;

public class fab {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int f = 0 ;
        int s1= 1  ;
        int n =s.nextInt();
        int t;
        System.out.println("enter the nth term" + n);
        while (n>0){
            t=f+s1;
            f=s1;
            s1=t;
            n=n-1;
            System.out.println("h term of fibonanci series:"+ f);
        }
    }
}
