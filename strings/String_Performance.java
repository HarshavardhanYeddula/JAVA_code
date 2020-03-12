package strings;

public class String_Performance {
    public static void main(String[] args) {
       long start = System.currentTimeMillis();
       string(100000);

       long end = System.currentTimeMillis();
        System.out.println("time taken for string performance" );
        System.out.println(end-start);



        long start1 = System.currentTimeMillis();
        stringBuilder(100000);

        long end1 = System.currentTimeMillis();
        System.out.println("time taken for stringbuilder performance" );
        System.out.println(end1-start1);




    }
    public static void string(int n) {
        String s = "";
        for (int i = 1; i <= n; i++) {
            s = s + i;
        }
    }


    public static void stringBuilder(int n){
        StringBuilder s1 = new StringBuilder("");
        for (int i = 1; i <=n ; i++) {
            s1.append(i);
        }
    }

}
