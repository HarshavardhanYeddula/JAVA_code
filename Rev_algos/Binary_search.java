package Rev_algos;

import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Number of elements to be inputted in array:");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]= s.nextInt();
        }
//        Sort(arr,n);
        System.out.println(binary_search(arr,s,n));
    }

//    public static void Sort(int arr[],int n){
//        for (int i = 0; i <n-1 ; i++) {
//            for (int j = 0; j <n-1-i ; j++) {
//                if (arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                }
//
//            }
//
//        }
//        for (int k = 0; k <n ; k++) {
//            System.out.print(arr[k]+" ");
//        }
//    }





    public static int binary_search(int arr[],Scanner s,int n){
        System.out.print("Enter the element for searching : ");
        int input = s.nextInt();
        int lo=0;
        int high=n-1;

        while (lo<=high){
            int m=(lo+high)/2;
            if (input>arr[m]){
                lo=m+1;
            }
            else if (input<arr[m]){
                high=m+1;
            }
            else {
                return m;
            }

        }
        return -1;
    }
}
