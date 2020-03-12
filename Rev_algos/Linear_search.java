package Rev_algos;

import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.print("Number of elements to be inputted in array:");
        int n = s.nextInt();
        int[] arr = new int[n];
        int i;
        for ( i = 0; i <n ; i++) {
            arr[i]=s.nextInt();

        }

        System.out.println(linear_search(s,arr,n));


    }

    public static int linear_search(Scanner s,int[] arr,int n) {
        System.out.println("Enter the element for searching ");
        int Enter = s.nextInt();
        for (int i = 0; i < n; i++) {
            if (Enter == arr[i]) {
                return i;
            }


        }
        return -1;
    }
}
