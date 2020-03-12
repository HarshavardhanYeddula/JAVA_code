package practice;

import java.util.Scanner;

public class All_Patterns {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
//        int m1=l.nextInt();
//        int m2=l.nextInt();
//        int m3=l.nextInt();
//        int m4=l.nextInt();
//        int m5=l.nextInt();
//        int sum=(m1+m2+m3+m4+m5)/5;
//        System.out.println(sum);


//                  OUTPUT

////                     3
////                    * * *
////                    * *
////                    *

//        Scanner s= new Scanner(System.in);
//        int n=s.nextInt();
//        for (int i = n; i >=1 ; i--) {
//            for (int j = 0; j <i ; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
////            OUTPUT

//
//        }


//                OUTPUT
//                3
//                *
//                * *
//                * * *

//
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        for (int i = n; i >= 0; i--) {
//            for (int j = 0; j <= n - i - 1; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//
//        }

//        OR

//
//        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//
//            }
//            System.out.println();
//
//
//        }














        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();


        }





    }
}
