package Rev_algos;

import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the range of array");
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
//            System.out.print(a[i]+"    ");
        }
        selection_sort(a,n);
    }
    public static void selection_sort(int arr[],int n){
        for (int i = 0; i <n-1 ; i++) {
            int min=i;
            for (int j = min+1; j <=n-1 ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min!=i){
                int temp = arr[min];
                arr[min]=arr[i];
                arr[i]= temp;
            }

        }
        System.out.println("Sorted array");
        for (int k = 0; k <n ; k++) {

            System.out.print(arr[k]+"  ");
        }
    }
}
