package Dynamic_Programming;

public class DP_Demos {
    public static long start;
    public static long end;

    public static void startAlgo(){
        start=System.currentTimeMillis();

    }
    public static long EndAlgo(){
        end=System.currentTimeMillis();
        return end-start;
    }


    public static void main(String[] args) {
        int n=45;
        int[] storage = new int[n+1];
        startAlgo();
        System.out.println(fib(n));
        System.out.println("For normal recurrsion call : "+EndAlgo());
        startAlgo();
        System.out.println(fibRS(n,storage));
        System.out.println("For recurrsion storage call : "+EndAlgo());

    }


    public static int fib(int n){
        if (n == 1) {
            return n;
        }
        if (n == 0) {
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        return fnm1+fnm2;
    }


    public static int fibRS(int n,int[] storage){
        if (n == 1) {
            return n;
        }
        if (n == 0) {
            return n;
        }
        int fnmRS1=fibRS(n-1,storage);
        int fnmRS2=fibRS(n-2,storage);
        return fnmRS1+fnmRS2;
    }
}
