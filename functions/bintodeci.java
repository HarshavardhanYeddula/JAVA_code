package functions;

public class bintodeci {
    public static void main(String[] args) {
        int deci = 11;
////      int bin = decitb(deci);
////        System.out.println((bin));
////    }
//        // int base=2;
//        //int any = deciany(deci, base);
//        //System.out.println((any));
//int base = 2;
//        int deci = anytodeci(any,base);
//        System.out.println(deci);
    }


//    public static int decitb(int deci){
//        int bin = 0;
//        int place = 1;
//        while(deci!=0){
//             int rem = deci%2;
//            deci = deci/2;
//            bin = bin+rem*place;
//            place = place*10;
//        }
//        return bin;


//    public static int deciany(int deci, int base) {
//        int any = 0;
//        int place = 1;
//        while (deci != 0) {
//            int rem = deci % base;
//            deci = deci / base;
//            any = any + rem * place;
//            place = place * 10;
//        }
//        return any;


    public static int bintodeci(int deci) {
        int bin = 0;
        int place = 1;
        while (deci != 0) {
            int rem = deci % 10;
            deci = deci / 10;
            bin = bin + rem * place;
            place = place * 2;
        }
        return bin;

//    public static int anytodeci(int any, int base) {
//        int deci = 0;
//        int place = 1;
//        while (any != 0) {
//            int rem = any % 10;
//            any = any / 10;
//            deci = deci + rem * place;
//            place = place * base;
//        }
//        return deci;
//    }

    }
}




