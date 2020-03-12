package Genrics;

import java.util.Comparator;

public class Car_cost_Comparator implements Comparator<Car> {
    @Override
    public int compare(Car tcar, Car ocar) {
        return ocar.cost-tcar.cost;
    }
}
