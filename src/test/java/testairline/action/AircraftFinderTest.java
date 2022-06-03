package testairline.action;

import airline.excepcion.IncorrectValueException;
import airline.excepcion.InvalidDataException;
import airline.excepcion.StorageException;
import airline.init.AircraftStorageInitializer;
import airline.read.AirctaftReader;
import airline.store.AircraftStorage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AircraftFinderTest {
    @BeforeClass
    public static void initTest() throws InvalidDataException {
        AirctaftReader airctaftReader = new AirctaftReader();
        AircraftStorageInitializer aircraftStorageInitializer = new AircraftStorageInitializer();
        aircraftStorageInitializer.init(airctaftReader.read("data\\sweets.txt"));
    }

    @Test
    public void findBySugarTest() throws StorageException, IncorrectValueException {
        //AircraftStorage storage = AircraftStorage.getInstance();
        //double expected = 15;
        //double actual = new SweetFinder().findBySugar(new GiftMaker().make(8), 14, 16).getFirst().getAmountOfSugar();
        //Assert.assertEquals(expected, actual, 0.01);
    }

}
