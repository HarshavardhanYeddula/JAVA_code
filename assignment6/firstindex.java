package assignment6;

import java.util.Scanner;

public class firstindex {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
        int[] a ={1,3,4,8,4};
        System.out.println(first(a,0,4));


    }
    public static int first(int[] a, int i , int data){
        if(i==a.length){
            return -1;
        }
        if(a[i]==data){
            return i;
        }
        else {
            int rest = first(a,i+1,data);
            return rest;
        }
    }
}
