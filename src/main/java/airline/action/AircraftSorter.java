package airline.action;

import airline.compare.AircraftFlightRangeComparator;
import airline.entity.Aircraft;
import airline.entity.Airline;
import airline.excepcion.InvalidDataException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.LinkedList;

public class AircraftSorter {
    // Провести сортировку самолетов компании по дальности полета.

    private static final Logger LOGGER = LogManager.getLogger(AircraftSorter.class);

    public void sortByFlightRange(Airline airline){
        LinkedList<Aircraft> aircrafts = airline.getAircrafts();
        Collections.sort(aircrafts, new AircraftFlightRangeComparator());
        try{
            airline.setAircrafts(aircrafts);
        } catch (InvalidDataException e) {
            LOGGER.log(Level.ERROR, "Problem with setting aitcrafts to airline", e);
        }
    }
}
