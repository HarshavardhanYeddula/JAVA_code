public class recr {
    public static void main(String[] args) {
        re(7);
    }
    public static void re(int n){
        if(n==0){
            return;
        }
//        System.out.println(n);
        re(n-1);
        System.out.println(n);
    }
}
