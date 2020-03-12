package array;

import java.util.Scanner;

public class lareleinarr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter number of elements to be taken in array :  ");
        int n = s.nextInt();
        System.out.print("enter the elements in array : ");
        int arr[] = new int[n];
        largernumberinarray(s,n,arr);

    }
     public static void largernumberinarray(Scanner s,int n, int arr[]){
        int max;
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        max = arr[0];
        for (int i = 0; i < n; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            System.out.print("maximum number : " + max);
        }
         System.out.println();
    }
}


