package airline.init;

import airline.create.AircraftCreator;
import airline.entity.Aircraft;
import airline.excepcion.InvalidDataException;
import airline.parse.AircraftParser;
import airline.store.AircraftStorage;
import airline.util.AircraftType;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;

public class AircraftStorageInitializer {
    private static final Logger LOGGER = LogManager.getLogger(AircraftStorageInitializer.class);

    public AircraftStorage init(LinkedList<String> strings) throws InvalidDataException {
        AircraftStorage storage = AircraftStorage.getInstance();
        AircraftType aircraftType;
        AircraftParser aircraftParser;
        AircraftCreator aircraftCreator;
        while(!strings.isEmpty()){
            aircraftParser = new AircraftParser(strings.removeFirst());
            aircraftCreator = new AircraftCreator(aircraftParser);
            try {
                aircraftType = aircraftParser.takeAircraftType();
                switch (aircraftType) {
                    case CARGO_AIRCRAFT -> storage.addAircraft(aircraftCreator.createCargoAircraft());
                    case PASSENGER_AIRCRAFT -> storage.addAircraft(aircraftCreator.createPassengerAircraft());
                    case MILITARY_AIRCRAFT -> storage.addAircraft(aircraftCreator.createMilitaryAircraft());
                    default -> throw new InvalidDataException("There is no such aircraft!");
                }
            } catch (InvalidDataException e) {
                LOGGER.log(Level.ERROR, "String contains invalid aircraft", e);
                throw new InvalidDataException("There is no such aircraft!");
            }
        }
        return storage;
    }
}
