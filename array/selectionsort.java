//package array;
//
//public class selectionsort {
//    public static void main(String[] args) {
//        int start = 0;
//        int ar[] = {1,3,4,5,6,7};
//        int end = ar.length;
//        int array = arrswap(ar[],start,end);
//        System.out.println(array);
//
//    }
//    public static int maxindexar(int ar[],int start,int end){
//        int index = start;
//        int max = ar[start];
//        for (int i = start ; i < end;i++) {
//            if(ar[i] > max) {
//                max = ar[i];
//                index = i;
//            }
//        }
//       return index;
//    }
//        public static int arrswap(int ar[],int start,int end) {
//            int t;
//            t = ar[start];
//            ar[start] = ar[end];
//            ar[end] = t;
//            for (int i = 0; i < end; i++) {
//                return ar[i];
//            }
//        }
//        public static void selection(int ar[]){
//                for (int i =0;i<ar.length;i++){
//                    int max =maxindexar(ar,0,ar.length-i-1);
//                    arrswap(ar,max,ar.length-i-1);
//                }
//        }
//}
