package strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = "";
        a = s.nextLine();
        pal(a);


    }
    public static void pal(String a){
        String b = "";
        int n = a.length();
        for (int i = n-1; i >= 0 ; i--) {
            b = b+a.charAt(i);

        }
        if (a.equalsIgnoreCase(b)){
            System.out.println("a and b are palindrome ");
        }
        else{
            System.out.println("a and b are not palindrome");
        }
    }
}
