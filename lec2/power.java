package lec2;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int x = s.nextInt();
        power(n,x);
        System.out.println(power(n,x));
    }

    public static int power(int n,int x){
        if(x==0){
            return 1;
        }
        int pnm1=power(n,x-1);
        int pn = n*pnm1;
        return pn;

    }
}
