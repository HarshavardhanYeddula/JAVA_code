package DP;

public class Dicecount {
    public static void main(String[] args) {
        System.out.println(dice(4,6));
        int target=3;
        int faces = 6;
        Integer mem[]=new Integer[target+1];
        int mem1[]=new int[target+1];
        System.out.println(diceDp(target,faces,mem));
        System.out.println(diceITR(target,faces,mem1));
    }
    public static int dice(int target,int faces ){
        if(target==0){
            return 1;
        }

        int cnt=0;
        for (int i = 1; i <=target && i<=faces ; i++) {
           cnt+= dice(target-i,faces);
        }
        return cnt;
    }
    public static int diceDp(int target,int faces,Integer[] mem){
        if(target==0){
            return 1;
        }
        if(mem[target]!=null){
            return mem[target];
        }
        int cnt =0;
        for (int i = 1; i <=faces && i<=target ; i++) {
            cnt+=diceDp(target-i,faces,mem);
        }
        mem[target]=cnt;
        return mem[target];
    }
    public static int diceITR(int target,int faces,int[] mem1){
        mem1[0]=1;

        for (int i = 1; i <=target ; i++) {
            for (int j = 1; j <=i &&j<=faces ; j++) {
                mem1[i]=mem1[i]+mem1[i-j];

            }
        }
        return mem1[target];
    }
}
