package strings;

import java.util.Scanner;

public class Palind {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        palindrome(a);
    }
        public static void palindrome(String a){
        String b = "";
        int n = a.length();
        for (int i = n-1; i >=0 ; i--) {
        b=b+a.charAt(i);
        }
            if (a.equalsIgnoreCase(b)) {
                System.out.println("Palind");
            }
            else{
                System.out.println("Not palind");
            }
        }
    }



