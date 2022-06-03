package testairline.entity;

import airline.entity.Aircraft;
import airline.entity.Airline;
import airline.entity.CargoAircraft;
import airline.entity.PassengerAircraft;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class AirlineTest {
    @Test
    public void setAirlineTest() throws Exception {
        Aircraft a1 = new CargoAircraft(1, "AI_22", 340, 233, 1000);
        Aircraft a2 = new PassengerAircraft(2, "Boeing", 300, 263, 120);
        LinkedList<Aircraft> aircrafts1 = new LinkedList<>();
        aircrafts1.add(a1);
        aircrafts1.add(a2);
        LinkedList<Aircraft> aircrafts2 = new LinkedList<>();
        aircrafts2.add(a2);
        aircrafts2.add(a1);

        LinkedList<Aircraft> expected = aircrafts2;
        Airline airline = new Airline(aircrafts1);
        airline.setAircrafts(aircrafts2);

        LinkedList<Aircraft> actual  = airline.getAircrafts();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void contains1() {
        Aircraft a1 = new CargoAircraft(1, "AI_22", 340, 233, 1000);
        Aircraft a2 = new PassengerAircraft(2, "Boeing", 300, 263, 120);
        LinkedList<Aircraft> aircrafts1 = new LinkedList<>();
        aircrafts1.add(a1);
        aircrafts1.add(a2);
        LinkedList<Aircraft> aircrafts2 = new LinkedList<>();
        aircrafts2.add(a2);
        aircrafts2.add(a1);

        boolean actual = aircrafts1.containsAll(aircrafts2);
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void contains2() {
        Aircraft a1 = new CargoAircraft(1, "AI_22", 340, 233, 1000);
        Aircraft a2 = new PassengerAircraft(2, "Boeing", 300, 263, 120);
        LinkedList<Aircraft> aircrafts1 = new LinkedList<>();
        aircrafts1.add(a1);
        aircrafts1.add(a2);
        LinkedList<Aircraft> aircrafts2 = new LinkedList<>();
        aircrafts2.add(a2);
        aircrafts2.add(a1);

        boolean actual = aircrafts2.containsAll(aircrafts1);
        boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

}
