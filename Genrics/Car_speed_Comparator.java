package Genrics;

import java.util.Comparator;

public class Car_speed_Comparator implements Comparator<Car> {
    @Override
    public int compare(Car tcar, Car ocar) {
        return ocar.speed-tcar.speed;
    }
}
