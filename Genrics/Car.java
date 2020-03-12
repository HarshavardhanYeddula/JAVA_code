package Genrics;
//
public class Car {
// implements Comparable<Car> {


    int speed;
    int cost;
    String color;

    public  Car(int speed ,int cost ,String color){
        this.speed=speed;
        this.cost=cost;
        this.color=color;
    }
    public String toString(){
        return " S:" + this.speed + " P:"+ this.cost+"  C: "+this.color;
    }

//    @Override
//    public int compareTo(Car other) {
////        return this.speed-other.speed;
//        return other.cost-this.cost;
//        return this.color.compareTo(other.color;
//    }
}
