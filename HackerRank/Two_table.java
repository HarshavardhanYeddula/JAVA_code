package HackerRank;

import java.util.Scanner;

public class Two_table {
    private static final Scanner s = new Scanner(System.in);
    public void main(String[] args) {

        int table = s.nextInt();
        s.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 1; i <= 10; i++) System.out.printf("%d x %d= %d%n", table, i, table * i);

    }
}



//
//    3
//
//            ([A-Z])(.+)
//
//            [AZ[a-z](a-z)
//
//            batcatpat(nat
