package PRACTICE_MAKES_MAN_PERFECT;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=s.nextInt();
        System.out.println();
        int [] arr =new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i]==arr[j]){
                    System.out.println("Duplicate values :"+ arr[j]);
                }
//                if we add else loop output will be printed for every increment
//                else {
//                    System.out.println("No Duplicate values  ");
//                }

            }

        }






    }
}
