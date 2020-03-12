package strings;

public class BASic_string {
    public static void main(String[] args) {
//      strings are immutable in java
//        Memory for string is allocated in heap(intern pool)
//         main will sit on top of stack
/*        Representation of string
        str = "hello"
        when hello is allocated 4k mem address
        hello will not change its address present in intern pool by any other variable

        "hello" will return the address position where or at which memory address "str" should point

 */
        String str = "hello";
        System.out.println(str);
        String s1 = "hello";
        System.out.println(s1);
         str = "world";
        System.out.println(str);

//  substring of a string
        String s =str.substring(0,3);
        System.out.println(s);
//        concatination of two strings
      //        type 1
        String s2= s1 + str;
        System.out.println(s2);

        System.out.println();
        // type 2
        System.out.println(s1.concat(str));

// to find where the index is located
        System.out.println(str.indexOf("or"));
        System.out.println(str.indexOf("OR"));


// to find whether the elements are presents are front or not
        /* if present it returns true
        else false
         */
        System.out.println(str.startsWith("w"));
        System.out.println();
        System.out.println();





//        to find the string is equal or not
//        == will check only the address
//        but equalsto() will check character by character

        String a1 = "hello";
        String a2 = a1;
        String a3 = "hello";
        String a4 = new String("hello");
        System.out.println(Equalto(a1,a4));
        System.out.println();
        System.out.println();
        System.out.println(EqualtoFun(a1,a4));


        System.out.println();
        System.out.println();
//
//




        int n =a1.length();
        for (int i = 0; i <n ; i++) {
            System.out.println(a1.charAt(i));
        }
    }
//    type 1
        public static boolean Equalto(String a1, String a4) {
            if (a1 == a4) {
                return true;
            } else {
                return false;
            }
        }
//      Type 2
    public static boolean EqualtoFun(String a1,String a2){
        if (a1.equals(a2)){
            return true;

        }
        else{
            return false;
        }



            }



}
