package Rev_algos;

import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
//            System.out.print(a[i]+"    ");
        }
        insertion_sort(a,n);
    }
    public static void insertion_sort(int[] a,int n){
        System.out.println("Sorted array");
        for (int i = 1; i <=n-1 ; i++) {
           int val = a[i];
           int j= i-1;
           while (j>=0 && a[j]>val){
               a[j+1]=a[j];
               j--;

           }
            a[j+1]=val;
                

        }
        for (int k = 0; k <n ; k++) {
            System.out.print(a[k]+"  ");
        }
    
    }


}
