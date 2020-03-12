package lec2;

import java.util.Scanner;

public class pat6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row= 1;
        int k =1;
        while(k<=2*n-1){
            int hmir=1 ;//hori mirror
            int col = 1;
            while(hmir<=2*n-1){
            if(col<=row){
                System.out.print("*");
            }
            else{
                System.out.println(" ");
            }
            }
            if(hmir<n){
                col= col+1;

            }
            else {
                col = col - 1;
            }
            hmir=hmir+1;
            }
            System.out.println();
            if(k<n) {
                row = row + 1;
            }
            else {
                row = row - 1;
            }
            k=k+1;
    }
}

