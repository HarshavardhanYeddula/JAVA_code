package Genrics;

import java.util.ArrayList;

public class Pair_client {
    public static void main(String[] args) {
        Pair<String> pair = new Pair<>();
        pair.one="abc";
        pair.two="def";

        Pair<Integer> pair1=new Pair<>();
        pair1.one=100;
        pair1.two=200;


        ArrayList<String> str = new ArrayList<>();



        Pair2<Integer,String> pair3= new Pair2<>();
        pair3.one= 100;
        pair3.two="200";
    }
}
