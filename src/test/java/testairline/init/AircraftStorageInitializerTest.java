package testairline.init;

import airline.excepcion.InvalidDataException;
import airline.init.AircraftStorageInitializer;
import airline.store.AircraftStorage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class AircraftStorageInitializerTest {
    @Test
    public void init() throws InvalidDataException {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("TYPE=PASSENGER_AIRCRAFT ID=3 NAME=Boeing FLIGHT_RANGE=1000 FUEL_CONSUMPTION=415 NUMBER_OF_SEATS=1000");
        AircraftStorageInitializer asi = new AircraftStorageInitializer();
        AircraftStorage storage = asi.init(strings);

        int expected = 1;
        int actual = storage.countOfAircrafts();
        Assert.assertEquals(expected, actual);
    }
}
