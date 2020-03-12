package practice;

import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("1st num:");
        int n1 =s.nextInt();
//        System.out.println("2nd num: ");
        int n2 =s.nextInt();
//        System.out.println("3rd num: ");
        int n3 = s.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1);
        }
        else if(n2>n1  && n2>n3){
            System.out.println(n2);
        }
        else{
            System.out.println(n3);
        }
    }
}
