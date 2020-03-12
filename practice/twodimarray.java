package practice;

import java.util.Scanner;

public class twodimarray {
    public static void main(String[] args) {
        System.out.println("enter the number of rows :");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        System.out.println("enter number of cols :");
        int col = s.nextInt();
        int[][] mat1 = new int[row][col];
        int[][] mat2 = new int[row][col];
        int[][] sum = new int[row][col];
        enterMatrixDatamat1(s, mat1, row, col);
        printMatrixmat1(mat1, row, col);
//        enterMatrixDatamat2(s,mat2,row,col);
//        printMatrixmat2(mat2,row,col);
//        printMatrixsum(sum,row,col);

    }

    public static void enterMatrixDatamat1(Scanner s, int[][] mat1, int row, int col) {
        System.out.println("enter matrix data:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat1[i][j] = s.nextInt();
            }
        }
    }

    public static void printMatrixmat1(int[][] mat1, int row, int col) {
        System.out.println("print matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat1[i][j] + "\t");

            }
            System.out.println();


        }
        if (row == col) {
            System.out.println("it is a square matrix");
        } else {
            System.out.println("it is not a square matrix");
    }
    }
}
//        public static void enterMatrixDatamat2(Scanner s ,int[][] mat2, int row,int col){
//            System.out.println("enter matrix data:");
//            for (int i = 0; i < row; i++) {
//                for (int j = 0; j < col; j++) {
//                    mat2[i][j] = s.nextInt();
//                }
//            }
//        }
//    public static void printMatrixmat2(int[][] mat2,int row, int col) {
//        System.out.println("print matrix");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                System.out.print(mat2[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void printMatrixsum(int[][] sum,int row, int col) {
//        System.out.println("print matrix");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                sum[i][j]=printMatrixmat1(); + printMatrixmat2();
//                System.out.print(sum[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }
//}

