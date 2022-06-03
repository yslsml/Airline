package airline.parse;

import airline.excepcion.InvalidDataException;
import airline.util.AircraftTags;
import airline.util.AircraftType;
import airline.valid.AircraftValidator;

import java.util.Locale;
import java.util.Scanner;

public class AircraftParser {
    private String source;

    public AircraftParser(String source) {
        this.source = source.toUpperCase();
    }

    public AircraftType takeAircraftType() throws InvalidDataException {
        if(AircraftValidator.isValidAircraft(this.source)) {
            int index = source.indexOf(AircraftTags.TYPE) + AircraftTags.TYPE.length();
            Scanner scanner = new Scanner(source.substring(index));
            scanner.useDelimiter("=| ");
            String aircraftTypeStr = scanner.next();
            if(AircraftValidator.isValidAircraftType(aircraftTypeStr)) {
                //создает элемент перечисления, соответствующий значению передаваемой строки;
                return AircraftType.valueOf(aircraftTypeStr);
            } else {
                throw new InvalidDataException("Invalid aircraftType");
            }
        } else {
            throw new InvalidDataException("Invalid aircraft");
        }
    }

    public String takeAircraftName() throws InvalidDataException {
        if(AircraftValidator.isValidAircraft(this.source)) {
            int index = source.indexOf(AircraftTags.NAME) + AircraftTags.NAME.length();
            Scanner scanner = new Scanner(source.substring(index));
            scanner.useDelimiter("=| ");
            return scanner.next();
        }else{
            throw new InvalidDataException("Invalid aircraft");
        }
    }

    public long takeAircraftId() throws InvalidDataException {
        if(AircraftValidator.isValidAircraft(this.source)){
            int index = source.indexOf(AircraftTags.ID) + AircraftTags.ID.length();
            Scanner scanner = new Scanner(source.substring(index));
            scanner.useDelimiter("=| ");
            long tmp = scanner.nextLong();
            if(AircraftValidator.isPositiveValue(tmp)) {
                return tmp;
            } else {
                throw new InvalidDataException("Invalid aircraft id");
            }
        }else{
            throw new InvalidDataException("Invalid aircraft");
        }
    }

    public float takeAircraftFlightRange() throws InvalidDataException {
        if(AircraftValidator.isValidAircraft(this.source)){
            int index = source.indexOf(AircraftTags.FLIGHT_RANGE) + AircraftTags.FLIGHT_RANGE.length();
            Scanner scanner = new Scanner(source.substring(index));
            scanner.useDelimiter("=| ");
            scanner.useLocale(Locale.US);
            //return scanner.nextFloat();
            float tmp = scanner.nextFloat();
            if(AircraftValidator.isPositiveValue(tmp)) {
                return tmp;
            } else {
                throw new InvalidDataException("Invalid aircraft flight range");
            }
        }{
            throw new InvalidDataException("Invalid aircraft");
        }
    }

    public float takeAircraftFuelConsumption() throws InvalidDataException {
        if(AircraftValidator.isValidAircraft(this.source)){
            int index = source.indexOf(AircraftTags.FUEL_CONSUMPTION) + AircraftTags.FUEL_CONSUMPTION.length();
            Scanner scanner = new Scanner(source.substring(index));
            scanner.useDelimiter("=| ");
            scanner.useLocale(Locale.US);
            //return scanner.nextFloat();
            float tmp = scanner.nextFloat();
            if(AircraftValidator.isPositiveValue(tmp)) {
                return tmp;
            } else {
                throw new InvalidDataException("Invalid aircraft fuel consumption");
            }
        }{
            throw new InvalidDataException("Invalid aircraft");
        }
    }

    public float takeAircraftLoadCapacity() throws InvalidDataException {
        if(AircraftValidator.isValidCargoAircraft(this.source)){
            int index = source.indexOf(AircraftTags.LOAD_CAPACITY) + AircraftTags.LOAD_CAPACITY.length();
            Scanner scanner = new Scanner(source.substring(index));
            scanner.useDelimiter("=| ");
            scanner.useLocale(Locale.US);
            //return scanner.nextFloat();
            float tmp = scanner.nextFloat();
            if(AircraftValidator.isPositiveValue(tmp)) {
                return tmp;
            } else {
                throw new InvalidDataException("Invalid aircraft load capacity");
            }
        }{
            throw new InvalidDataException("Invalid aircraft");
        }
    }

    public int takeAircraftNumberOfSeats() throws InvalidDataException {
        if(AircraftValidator.isValidPassengerAircraft(this.source)){
            int index = source.indexOf(AircraftTags.NUMBER_OF_SEATS) + AircraftTags.NUMBER_OF_SEATS.length();
            Scanner scanner = new Scanner(source.substring(index));
            scanner.useDelimiter("=| ");
            //return scanner.nextInt();
            int tmp = scanner.nextInt();
            if(AircraftValidator.isPositiveValue(tmp)) {
                return tmp;
            } else {
                throw new InvalidDataException("Invalid aircraft number of seats");
            }
        }else{
            throw new InvalidDataException("Invalid aircraft");
        }
    }

    public int takeAircraftNumberOfBombs() throws InvalidDataException {
        if(AircraftValidator.isValidMilitaryAircraft(this.source)){
            int index = source.indexOf(AircraftTags.NUMBER_OF_BOMBS) + AircraftTags.NUMBER_OF_BOMBS.length();
            Scanner scanner = new Scanner(source.substring(index));
            scanner.useDelimiter("=| ");
            //return scanner.nextInt();
            int tmp = scanner.nextInt();
            if(AircraftValidator.isPositiveValue(tmp)) {
                return tmp;
            } else {
                throw new InvalidDataException("Invalid aircraft number of bombs");
            }
        }else{
            throw new InvalidDataException("Invalid aircraft");
        }
    }

}
