package array;

import java.util.Scanner;

public class Max_Element_in_Array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = {1,15,60,2,31,51};
        int n =arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i <n ; i++) {

            if (arr[i] >max){
                max=arr[i];

            }
            else if (arr[i] <min){
                min=arr[i];

            }


        }
        System.out.println(max);
        System.out.println(min);
        System.out.println();
    }


}
