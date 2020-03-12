package recurssion;

public class oddeven {
    public static void main(String[] args) {
        ev(6);
    }
    public static void ev(int n) {
        if (n == 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n);
            ev(n-1);
            return;
        }
        if(n%2 == 0){
            ev(n-1);
            System.out.println(n);
            return;
        }
        ev(n - 1);
    }
}

