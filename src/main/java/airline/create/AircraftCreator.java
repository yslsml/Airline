package airline.create;

import airline.entity.CargoAircraft;
import airline.entity.MilitaryAircraft;
import airline.entity.PassengerAircraft;
import airline.excepcion.InvalidDataException;
import airline.parse.AircraftParser;

public class AircraftCreator {
    private AircraftParser aircraftParser;

    public AircraftCreator(AircraftParser parser) {
        this.aircraftParser = parser;
    }

    public CargoAircraft createCargoAircraft() throws InvalidDataException {
        return new CargoAircraft(aircraftParser.takeAircraftId(),aircraftParser.takeAircraftName(),
                    aircraftParser.takeAircraftFlightRange(), aircraftParser.takeAircraftFuelConsumption(),
                    aircraftParser.takeAircraftLoadCapacity());
    }

    public PassengerAircraft createPassengerAircraft() throws InvalidDataException {
        return new PassengerAircraft(aircraftParser.takeAircraftId(),aircraftParser.takeAircraftName(),
                aircraftParser.takeAircraftFlightRange(), aircraftParser.takeAircraftFuelConsumption(),
                aircraftParser.takeAircraftNumberOfSeats());
    }

    public MilitaryAircraft createMilitaryAircraft() throws InvalidDataException {
        return new MilitaryAircraft(aircraftParser.takeAircraftId(),aircraftParser.takeAircraftName(),
                aircraftParser.takeAircraftFlightRange(), aircraftParser.takeAircraftFuelConsumption(),
                aircraftParser.takeAircraftLoadCapacity(), aircraftParser.takeAircraftNumberOfBombs());
    }

}
