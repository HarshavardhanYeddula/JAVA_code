package recurssion;

import java.util.Scanner;

public class manmohan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number of rows :");
        int row = s.nextInt();
        System.out.println("enter number of cols");
        int col = s.nextInt();
        manmo(row,col);
    }
    public static void manmo(int row,int col){
        for (int i =0;i<=row;i++){
            for (int j = 0; j <=i ; j++) {

                if(j==1 || j==i)
                {
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(0 + " ");
                }

            }
            System.out.println();
        }

    }
}
