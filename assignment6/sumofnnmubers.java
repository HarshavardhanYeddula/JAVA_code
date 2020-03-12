package assignment6;

import java.util.Scanner;

public class sumofnnmubers {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int sum =0;
        int n = s.nextInt();
        sum(n,sum);
    }
    public static void sum(int n,int sum){
        if(n==0){
            return;
        }
        sum(n-1,sum);
        sum = sum+n;
        System.out.println(sum);
    }
}
