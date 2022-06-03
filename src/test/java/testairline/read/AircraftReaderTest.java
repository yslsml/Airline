package testairline.read;

import airline.read.AirctaftReader;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;

public class AircraftReaderTest {

    @Test
    public void readTestSucsess(){
        LinkedList<String> strings1 = new LinkedList<>();
        String str1 = "TYPE=PASSENGER_AIRCRAFT ID=9 NAME=Airbus_Beluga FLIGHT_RANGE=600 FUEL_CONSUMPTION=400 NUMBER_OF_SEATS=300";
        String str2 = "TYPE=PASSENGER_AIRCRAFT ID=10 NAME=Saab_AB FLIGHT_RANGE=500 FUEL_CONSUMPTION=150 NUMBER_OF_SEATS=250";
        strings1.add(str1);
        strings1.add(str2);
        AirctaftReader airctaftReader = new AirctaftReader();
        LinkedList<String> strings2 = airctaftReader.read("data\\aircraftsTest.txt");
        Assert.assertEquals(strings1,strings2);
    }
}
