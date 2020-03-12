package practice;

import java.util.Scanner;

public class triangles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum =0;
//        sum=sum+n;
        trian(n,sum);
    }
    public static void trian(int n,int sum) {
        if (n == 0) {
            return;
        }
        trian(n-1,sum+n);
        System.out.println(sum);
    }
}
