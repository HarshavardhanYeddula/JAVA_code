package DP;

public class fibo {
    public static void main(String[] args) {
        int n =5;
        Integer mem[]=new Integer[n+1];

//        System.out.println(fib(n));
        System.out.println(fibodp(n,mem));
        System.out.println(fiboITR(n,mem));
    }
    public int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int fibodp(int n,Integer[] mem){
        if (n < 2) {
            return n;
        }
        if(mem[n]!=null){
            return mem[n];
        }
        mem[n]=fibodp(n-1,mem)+fibodp(n-2,mem);
        return mem[n];
    }
    public static int fiboITR(int n,Integer[] mem){
        mem[0]=0;
        mem[1]=1;
        for (int i = 2; i <=n ; i++) {
            mem[n]=mem[i-1]+mem[i-2];

        }
        return mem[n];
    }
}
