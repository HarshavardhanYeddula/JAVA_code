package backtracking;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int ar[]={5,4,3,2,1};
        System.out.println(Arrays.toString(mergesort(ar)));

    }

    public static int[] mergesort(int[] ar) {
        if (ar.length == 1) {
            return ar;
        }

        int mid = ar.length / 2;
        int first[] = mergesort(Arrays.copyOfRange(ar, 0, mid));
        int second[] = mergesort(Arrays.copyOfRange(ar, mid, ar.length));
        return merge(first, second);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] merg = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                merg[k] = first[i];
                i++;
                k++;
            }
            else{
                merg[k] = second[j];
                j++;
                k++;
            }
        }
        while ((i < first.length)) {
            merg[k] = first[i];
            i++;
            k++;
        }
        while ((j < second.length)) {
            merg[k] = second[j];
            j++;
            k++;
        }
        return merg;
    }
}
