//package backtracking;
//
//public class quicksort {
//    public static void main(String[] args) {
//        int ar[];
//        quicksort(ar, 0, ar.length);
//    }
//
//    public static void quicksort(int[] ar,int end,int start) {
//        if(end<=start){
//            return;
//
//        }
//        int pivot = end-1;
//        pivot = swapping(ar,start,pivot);
//        quicksort(ar,start,pivot);
//        quicksort(ar,pivot+1,end);
//
//
//    }
//
//    public static int swapping( int[] ar,int start, int pivot) {
//        int j = start;
//        for (int i = start; i < pivot; i++) {
//            if (ar[i] < ar[pivot]) {
//                int temp = ar[i];
//                ar[i] = ar[j];
//                ar[j] = temp;
//                j++;
//
//            }
//        }
//        int temp = ar[pivot];
//        ar[pivot] = ar[j];
//        ar[j] = temp;
//    }
//}
