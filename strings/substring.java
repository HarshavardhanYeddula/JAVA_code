package strings;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str =s.nextLine();
        for (int i = 0; i <str.length() ; i++) {
            for (int j = i+1; j <str.length() ; j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
