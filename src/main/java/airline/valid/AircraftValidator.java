package airline.valid;

import airline.util.AircraftTags;
import airline.util.AircraftType;

// валидация, является ли строка информацией о воздушном судне
public class AircraftValidator {

    public static boolean isValidAircraft(String aircraft){
        aircraft = aircraft.toUpperCase();
        return aircraft.contains(AircraftTags.ID) && aircraft.contains(AircraftTags.NAME)  &&
                aircraft.contains(AircraftTags.TYPE) && aircraft.contains(AircraftTags.FLIGHT_RANGE) &&
                aircraft.contains(AircraftTags.FUEL_CONSUMPTION);
    }

    public static boolean isValidCargoAircraft(String aircraft){
        aircraft = aircraft.toUpperCase();
        return isValidAircraft(aircraft) && aircraft.contains(AircraftTags.LOAD_CAPACITY);
    }

    public static boolean isValidPassengerAircraft(String aircraft){
        aircraft = aircraft.toUpperCase();
        return isValidAircraft(aircraft) && aircraft.contains(AircraftTags.NUMBER_OF_SEATS);
    }

    public static boolean isValidMilitaryAircraft(String aircraft){
        aircraft = aircraft.toUpperCase();
        return isValidCargoAircraft(aircraft) && aircraft.contains(AircraftTags.NUMBER_OF_BOMBS);
    }

    public static boolean isValidAircraftType(String aircraftTypeStr){
        AircraftType[] aircraftsType = AircraftType.values();
        for(AircraftType aircraftType : aircraftsType){
            if(aircraftType.toString().equalsIgnoreCase(aircraftTypeStr)){
                return true;
            }
        }
        return false;
    }

    public static boolean isPositiveValue(int num) {
        return num >= 0;
    }

    public static boolean isPositiveValue(float num) {
        return num >= 0;
    }

    public static boolean isPositiveValue(long num) {
        return num >= 0;
    }

}
