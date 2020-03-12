package practice;

import java.util.Scanner;

public class palindr {
    public static void main(String[] args) {
        String a="";
        String b="";
        Scanner s = new Scanner(System.in);
        a=s.nextLine();
        int n =a.length();
        for (int i = n-1; i >=0 ; i--) {
            b=b+a.charAt(i);

        }
        if (a.equalsIgnoreCase(b)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("no palindrome");
        }
    }
}
