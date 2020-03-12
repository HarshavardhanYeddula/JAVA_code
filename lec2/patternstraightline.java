package lec2;

import java.util.Scanner;

public class patternstraightline {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();

        for(int i=0;i<row;i++){
            for(int j =0 ;j<col;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
