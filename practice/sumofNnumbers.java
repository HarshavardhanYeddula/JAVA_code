package practice;

import java.util.Scanner;

public class sumofNnumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = s.nextInt();
        int count =1;
        int sum =0;
    while(count<=n) {
//        System.out.println(count);
        sum = sum +count;
        count=count+1;
    }
        System.out.println(sum);
    }
}
