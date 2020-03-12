package practice;

public class decitoany {
    public static void main(String[] args) {
        int deci = 111;
        int base = 8;
        int any = decitoanything(deci, base);
        System.out.println(any);

    }

    public static int decitoanything(int deci, int base) {
        int any = 0;
        int place = 1;
        while (deci != 0) {
            int rem = deci % base;
            deci = deci / base;
            any = any + rem * place;
            place = place * 10;
        }
        return any;
    }
}
