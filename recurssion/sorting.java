package recurssion;

public class sorting {
    public static void main(String[] args) {
    int[] a = {1,2,3,5,4};
        System.out.println(sort(a,0));
    }
    public static boolean sort(int a[],int index){
        if(index == a.length-1){
            return true;

        }
        if (a[index]>a[index+1]){
            return false;
        }
        return sort(a,index+1);
    }
}