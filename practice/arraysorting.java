package practice;


import java.util.Arrays;

public class arraysorting {
    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 6, 4, 7};
        Arrays.sort(a);
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}

//    public static void main(String[] args) {
//
//
//        int[] a ={2,3,5,1,6,4,7};
//        int temp;
//        int n = a.length;
//        for (int i = 1; i <n ; i++) {
//            for (int j = i; j > 0 ; j--) {
//                if(a[j] < a[j-1]) {
//                    temp = a[j];
//                    a[j] = a[j - 1];
//                    a[j - 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < n ; i++) {
//            System.out.println(a[i]);
//        }
//    }
//}
