//package DP;
//
//public class Broken_egg {
//    public static void main(String[] args) {
//
//    }
//
//    public static int drop(int floor,int eggs) {
//        if(floor==0){
//            return 0;
//        }
//        if (eggs==1){
//            return floor;
//        }
//        int best = floor;
//        for (int k =1;k<=floor;k++){
//            int broken = drop(k-1,eggs-1);
//            int safe = drop(floor-k,eggs);
//            int worst = Math.max(broken,safe);
//        }
//        return
//    }
//}
