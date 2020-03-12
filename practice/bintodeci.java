package practice;

public class bintodeci {
    public static void main(String[] args) {
        int bin = 10110;
        int deci = bintod(bin);
        System.out.println(deci);
    }
    public static int bintod(int bin){
        int deci = 0;
        int place = 1;
        while (bin!=0){
            int rem = bin%10;
            bin = bin/10;
            deci =deci+rem*place;
            place=place*2;
        }
        return deci;
    }
}
