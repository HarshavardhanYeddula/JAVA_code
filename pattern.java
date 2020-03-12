import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        int col = 0;
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        patt(row, col);

    }

    public static void patt(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col == row) {
            System.out.println();
            patt(row - 1, 0);
//            System.out.println();
            return;
        }
        System.out.print(" * ");
        patt(row, col + 1);


    }
}

