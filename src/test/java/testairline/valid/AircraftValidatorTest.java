package testairline.valid;

import airline.valid.AircraftValidator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AircraftValidatorTest {
    @Test
    public void isValidSweetTest(){
        String testStr = "TYPE=MILITARY_AIRCRAFT ID=5 NAME=Tu_80 FLIGHT_RANGE=1050 FUEL_CONSUMPTION=600 LOAD_CAPACITY=1300 NUMBER_OF_BOMBS=50";
        Assert.assertTrue(AircraftValidator.isValidAircraft(testStr));
        Assert.assertTrue(AircraftValidator.isValidMilitaryAircraft(testStr));
        Assert.assertFalse(AircraftValidator.isValidPassengerAircraft(testStr));
        Assert.assertTrue(AircraftValidator.isValidCargoAircraft(testStr));
    }

    @Test
    public void isValidSweetTest1(){
        Assert.assertTrue(AircraftValidator.isValidAircraftType("Military_Aircraft"));
        Assert.assertFalse(AircraftValidator.isValidAircraftType("MilitaryAircraft"));
    }
}
