package Genrics;

import java.util.Comparator;

public class ArrayinGenrics {
    public static void main(String[] args) {
//        Integer[] arri={1,2,3,4,5,6};
//        display(arri);
//        String[] arrs={"h","el","lo"};
//        display(arrs);

        Car[] cars= new Car[5];
        cars[0]=new Car(100,10000,"black");
        cars[1]=new Car(200,15000,"maroon");
        cars[2]=new Car(90,9500,"red");
        cars[3]=new Car(300,20000,"green");
        cars[4]=new Car(50,50000,"blue");
        display(cars);
        System.out.println("Sorting according to high to low speed");
        bubblesort(cars,new Car_speed_Comparator());
        display(cars);
        System.out.println("Sorting according to low to high cost");
        bubblesort(cars,new Car_cost_Comparator());
        display(cars);
        System.out.println("Sorting according to lexographical order");
        bubblesort(cars,new Car_color_Comparator());
        display(cars);
//        Object obj= new Object();
    }

//    public static void display(String[] arr) {
//        for (String val:arr) {
//            System.out.print(val+" ");
//
//        }
//        System.out.println();
//    }
//    public static void display(Integer[] arr){
//        for (Integer val:arr) {
//            System.out.print(val+" ");
//        }
//        System.out.println();
//    }

    public static <T>void display(T[] ar) {
        for (T val:ar) {
            System.out.println(val+" ");
        }
        System.out.println();
    }

    public static <T>void bubblesort(T [] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (comparator.compare(arr[j],arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


}
