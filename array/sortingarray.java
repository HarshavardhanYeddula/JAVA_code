package array;

public class sortingarray {
    public static void main(String[] args) {
        int[] arr = {9 , 8 , 6 , 7};
        int l = arr.length;
        sorted(arr,l);
    }

    public static void sorted(int[] arr, int l) {
        for (int i = 0; i < l; i++) {
            for (int j = i+1; j < l; j--) {
                if (arr[i] < arr[j ]) {
                    int temp = arr[i];
                    arr[i] = arr[j ];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i <l-1 ; i++) {
            System.out.println(arr[i] + " , ");
        }
        System.out.println(arr[l-1]);
    }


}
