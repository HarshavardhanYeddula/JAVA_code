package practice;

public class inverse {
    public static void main(String[] args) {
        int n = 34521;
        int inv = inversenum(n);
        System.out.println(inv);
    }
    public static int inversenum(int n){
        int inv =0;
        int place=1;
        while (n!=0){
            int rem = n%10;
            n=n/10;
            inv= (int) (inv+place*Math.pow(10,rem - 1));
            place=place+1;
        }
        return inv;
    }
}

