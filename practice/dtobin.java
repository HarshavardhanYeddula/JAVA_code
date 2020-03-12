package practice;

public class dtobin {
    public static void main(String[] args) {
    int deci = 100;
    int bin = decitobinary(deci);
        System.out.println(bin);
    }

    public static int decitobinary(int deci){
    int bin =0;
    int place = 1;
    while(deci!=0){
        int rem = deci%2;
        deci = deci/2;
        bin = bin+rem*place;
        place = place*10;
    }
    return bin;
    }
}
