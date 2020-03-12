package assignment6;

public class arraysort {
    public static void main(String[] args) {
        int[] ar = {3,8,9};
        System.out.println(sorted(ar,0));
    }
    public static boolean sorted(int[] ar, int i){
        if(i==ar.length-1){
            return  true;
        }
        if(ar[i]>ar[i+1]){
            return  false;
        }
        else{
            boolean restans = sorted(ar,i+1);
            return restans;
        }
    }
}
