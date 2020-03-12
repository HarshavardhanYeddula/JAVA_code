package Genrics;

import java.util.Comparator;

public class Car_color_Comparator implements Comparator<Car> {
    @Override
    public int compare(Car tcar, Car ocar) {
        return tcar.color.compareTo(ocar.color);
    }
}
