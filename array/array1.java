package array;

import java.util.Arrays;
import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
   int ar[] = {1, 2, 3, 4, 5};
   Scanner s = new Scanner(System.in);
   int first = s.nextInt();
   int second = s.nextInt();
        System.out.println(Arrays.toString(ar));
        swap(ar,first,second);
        System.out.println(Arrays.toString(ar));


}
public static void swap(int ar[],int first,int second){
    int temp =ar[first];
     ar[first] = ar[second];
    ar[second] = temp;
    }
    public static int max(int ar[]){

        int max=ar[0];
        for(int i=1;i<=ar.length;i++){
            if (max<ar[i])
            {max = ar[i];
            }
        }
        return max;
    }
    public static int maxindex(int ar[]){

        int max=0;
        for(int i=1;i<=ar.length;i++){
            if (ar[max]<ar[i])
            {
                max = i;
            }
        }
        return max;
    }
}