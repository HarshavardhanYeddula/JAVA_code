package lec2;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in) ;
       int start = s.nextInt();
       int end = s.nextInt();
       int step = s.nextInt();
       fun(start,end,step);
    }
    public static void fun(int start, int end,int step){

        while(start < end){
            int c = (5 * (start-32)) / 9;
            System.out.println(c);
            start=start+step;
        }
    }
}
