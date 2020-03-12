package practice;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i, m = 0, flag = 0, sum = 0;
        int low = s.nextInt();
        int high = s.nextInt();//it is the number to be checked


        for (int n = low; n <= high; n++) {
            m = n / 2;
            if (n == 0 || n == 1) {
                //System.out.println(n+" is not prime number");
            } else {
                for (i = 2; i <= m; i++) {
                    if (n % i == 0) {
                        // System.out.println(n+" is not prime number");
                        flag = 1;
                        break;

                    }
                }
                if (flag == 0) {
                    sum = sum + 1;
                }

            }

        }
        System.out.println(sum);
    }
}

//
//        System.out.println(gcd(n1, n2));
//    }
//
//
//    public static int gcd(int n1, int n2) {
//
//        while (n1 != n2) {
//            if (n1 > n2) {
//                n1 = n1 - n2;
//                return n1;
//            }
//            else {
//                n2 = n2 - n1;
//            }
//
//                return n2;
//            }
//        return n2;
//        Scanner s = new Scanner(System.in);
//        int n1 = s.nextInt();
//        while(n)
//    }
//    }


//public class gcd{
//    public static void main(String[] args) {
//        int n1 = 15;
//        int n2 = 20;
//        int gcd = 1;
//        for (int i = 1; i<=n1 && i<=n2 ; i++)
//        {
//            if(n1%i == 0 && n2%i==0)
//            {
//                gcd = i;
//            }
//            int lcm = (n1*n2)/gcd;
//            System.out.println( lcm );
//        }
//
//    }
//}


//public class gcd;{
//public static void main(String[]args){
//        int a = 15;
//        int b = 20;
//        System.out.println(low(a,b))
//        }
//        }
//    public static int great(int a, int b){
//        if(a==0){
//            return b;
//            return great(b%a,a);
//        }
//        public static int low(int a,int b){
//            return  (a*b)/gcd(a,b);
//        }
//        }
//
//



