package practice;

public class sumarray {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,4,5,5,6,7,8,9};
        int sum = 0;
        double aver;
        for(int num:ar){
            sum=sum+num;

        }
        int lengt=ar.length;
        aver= ((double)sum)/((double)lengt);
        System.out.println("sum= "+sum);
        System.out.println("average = " +aver);
    }
}
