package airline.compare;

import airline.entity.Aircraft;

import java.util.Comparator;

public class AircraftFlightRangeComparator implements Comparator<Aircraft> {
    @Override
    public int compare(Aircraft o1, Aircraft o2) {
        return Double.compare(o1.getFlightRange(), o2.getFlightRange());
    }

}
