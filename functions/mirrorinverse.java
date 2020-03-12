package functions;

import java.util.Scanner;

public class mirrorinverse {
    public static void main(String[] args) {

        int n = 32415;
        System.out.println(inverse(n));

    }

    public static int inverse(int n) {
        int inv = 0;
        int place = 1;
        while (n != 0) {
            int value = n % 10;
            n = n / 10;
            inv = (int)(inv + place * Math.pow(10, value-1));
            place = place+1;
        }
        return inv;
    }
}


//    Scanner s = new Scanner(System.in);
//    int n = s.nextInt();
//    int rem = 0;
//    int place = 1;
//    while(n!=0){
//        rem=n%10;
//        n=n/10;
//        place=place+1;
//        rem = rem * 10 ** (place - 1);





