package stack;

public class WAVEform {

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {6, 5, 4}, {7, 8, 9}};
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            else {

                for (int j = arr[i].length - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }


        }
        System.out.println("end");
    }
}


