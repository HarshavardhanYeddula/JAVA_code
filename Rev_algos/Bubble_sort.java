package Rev_algos;

import java.util.Scanner;

public class Bubble_sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range of array: ");
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
//            System.out.print(a[i]+"    ");
        }
        bubble_sort(a,n);
    }

    public static void bubble_sort(int a[],int n){
        for (int i = 0; i <n-1 ; i++) {
            for (int j = 0; j <n-1-i ; j++) {
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Bubble sorted array");
        for (int k = 0; k <n ; k++) {

            System.out.print(a[k]+"  ");

        }
    }
}
