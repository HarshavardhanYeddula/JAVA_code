package DP;




public class Mazepath {
    public static void main(String[] args) {
        int row = 3;
        int col =3;
        int mem[][]=new int[row+1][col+1];
        System.out.println(mazepathdp(3,3,mem));
        System.out.println(mazepath(row,col));
        System.out.println(mazepathITR(row,col,mem));
    }



    public static int mazepath(int row,int col){
        if(row==1 || col == 1){
            return 1;
        }
        return mazepath(row-1,col)+mazepath(row,col-1);

    }



    public static int mazepathdp(int row,int col,int[][] mem){
        if(row==1 || col == 1){
            return 1;
        }
        if(mem[row][col]!=0){
            return mem[row][col];
        }
        mem[row][col]= mazepathdp(row-1,col,mem)+mazepathdp(row,col-1,mem);
        return mem[row][col];
    }





    public static int mazepathITR(int row,int col,int[][] mem) {
        for (int i = 1; i < +row; i++)
            {
                for (int j = 1; j <= col; j++) {
                    if (i == 1 || j == 1) {
                        mem[i][j] = 1;
                    } else {
                        mem[i][j] = mem[i - 1][j] + mem[i][j - 1];
                    }

                }

            }
            return mem[row][col];
        }
    }

