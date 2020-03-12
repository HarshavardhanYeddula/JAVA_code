package backtracking;

import java.util.Arrays;

public class lexopermute {
    public static void main(String[] args) {
        String str = "abc";
        int fre[]= frequency(str);
        System.out.println(fre);
//        System.out.println(Arrays.toString(fre));
//        lexo("",str.length(),fre);

    }
//    public static void lexo(String processed,int length,int[] fre){
//        if(length==0){
//            System.out.println(processed);
//            return;
//        }
//        for (int i = 0; i <fre.length ; i++) {
//            if(fre[i]>0){
//                fre[i]--;
//                lexo(processed+(char)(i+'a'),length-1,fre);
//                fre[i]++;
//            }
//
//        }
//    }
    public static int[] frequency(String str){
        int fre[] = new int[26];
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            fre[ch-'a']++;
        }
        return fre;
    }
}
