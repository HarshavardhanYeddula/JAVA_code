package Arrayes;

import java.util.Scanner;

public class Find_Elements_in_array {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = s.nextInt();
        int a[] = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element at index " + i + " :");
            a[i] = s.nextInt();

//            System.out.print(a[i]+"->");
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "->");
        }
        System.out.print("end");
        System.out.println();

        System.out.println("Enter Search element");
        int User_input = s.nextInt();
        boolean Found = true;


        for (int i = 0; i < n; i++) {
            if (a[i] == User_input) {
                Found = true;
            } else {
                Found = false;
            }
        }


        if (Found == true){
            System.out.println("Element found ");
    }
    else

    {

        System.out.println("Element not found");
    }
}

//        System.out.println("Sum of array :" + sum);
    }
