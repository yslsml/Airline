package testairline.parse;

import airline.excepcion.InvalidDataException;
import airline.parse.AircraftParser;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class AircraftParserTest {
    @Test
    public void parseTest() throws InvalidDataException {
        AircraftParser aircraftParser = new AircraftParser("TYPE=CARGO_AIRCRAFT ID=7 NAME=Airbus_A14 FLIGHT_RANGE=440 FUEL_CONSUMPTION=320 LOAD_CAPACITY=2500");
        Assert.assertTrue(aircraftParser.takeAircraftType().toString().equals("CARGO_AIRCRAFT"));
        Assert.assertTrue(aircraftParser.takeAircraftName().toString().equals("AIRBUS_A14"));
        Assert.assertEquals(aircraftParser.takeAircraftFlightRange(), 440, 0.01);
        Assert.assertEquals(aircraftParser.takeAircraftFuelConsumption(), 320, 0.01);
        Assert.assertEquals(aircraftParser.takeAircraftLoadCapacity(), 2500, 0.01);
        Assert.assertEquals(aircraftParser.takeAircraftId(), 7);
        //LinkedList list = new LinkedList();
    }

}
