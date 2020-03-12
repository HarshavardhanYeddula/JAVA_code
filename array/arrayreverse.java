package array;

public class arrayreverse {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {3,4}
        };

        for (int i = arr.length - 1; i >= 0 ; i--) {
            for (int j = arr[i].length-1; j >=0 ; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
