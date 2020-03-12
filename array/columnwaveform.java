package array;

import javax.swing.*;

public class columnwaveform {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8},
                {9, 10, 11, 12}, {13, 14, 15, 16}};
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < a[i].length ; j++) {
                    System.out.println(a[j][i]);

                }
            } else {
                for (int j = a[i].length-1; j >=0; j--) {


                    System.out.println(a[j][i]);


                }

            }
        }
    }
}
