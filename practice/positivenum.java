package practice;

import java.util.Scanner;

public class positivenum {
    public static void main(String[] args) {
        int lo[] = {1, 2, 88, 42, 99, 10, 11, 99, 98, 88, 77, 11, 12, -1, 99, 12, 34, -8, -55, -100, -99, -99, 10, 11, -66, 34, -34, -67, -78, -87};
        int len = lo.length;
        for(int i = 0;i<=len-1;i++ ){
            if (lo[i]<0)
                break;

            System.out.println(lo[i]);
        }
    }
}