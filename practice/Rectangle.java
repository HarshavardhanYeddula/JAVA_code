package practice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        if(row==col){
            System.out.println("Square pattern");
        }
        else{
            System.out.println("rectangle");
        }

        for (int i = 0; i <row ; i++) {
            if (i==0&&i==row-1){
                for (int j = 0; j <col ; j++) {
                    System.out.print(" * ");
                }
            }

        }
        for (int j = 0; j <col ; j++) {
            if(j==0&&j==col-1){
                for (int i = 0; i <row ; i++) {
                    System.out.print(" * ");
                }
            }

        }

    }
}
