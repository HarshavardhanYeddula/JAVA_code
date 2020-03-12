//package recurssion;
//
//public class bubblesorting {
//    public static void main(String[] args) {
//        int[] a = {1,3,5,2,7};
//        int n = a.length;
//        pattern(a,n-1,0);
//
//            }
//    public static void bubble(int a[],int row,int col){
//        if(row==0){
//            return;
//
//        }
//        if(col==row){
//            bubble(a,row-1,0);
//            return;
//        }
//        if(a[col]>a[col+1]){
//            int temp = a[col];
//            a[col]=a[col+1];
//            a[col+1]=temp;
//        }
//        bubble(a,row,col+1);
//
//
//
//
//    }
//}
