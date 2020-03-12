package Genrics;

public class Genrics_linked_list_client {
    public static void main(String[] args) {
        Genrics_linked_list<Car> list = new Genrics_linked_list<>();
        Car[] cars = new Car[5];
        cars[0]=new Car(100,10000,"black");
        cars[1]=new Car(200,15000,"maroon");
        cars[2]=new Car(90,9500,"red");
        cars[3]=new Car(300,20000,"green");
        cars[4]=new Car(50,50000,"blue");
        list.addlast(cars[0]);
        list.addlast(cars[1]);
        list.addlast(cars[2]);
        list.addlast(cars[3]);
        list.addlast(cars[4]);
        list.display();

    }
}
