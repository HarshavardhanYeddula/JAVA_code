package recurssion;

public class pattern {
    public static void main(String[] args) {
//        int row = 3;
//        int col = 0;
//        int n = 0;
        pat(5,1, 1);
    }

    public static void pat(int n,int row, int col) {
        if (row >n ) {
            return;
        }
        if (col >row) {
            System.out.println();
            pat(n,row + 1, 1);
            return;
        }
        System.out.print("*");
        pat(n,row, col + 1);
//        System.out.print("*");
//        pat(row, col + 1);
    }

}
