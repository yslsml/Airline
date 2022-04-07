package airline.action;

import airline.entity.Aircraft;
import airline.entity.Airline;
import airline.excepcion.IncorrectValueException;

import java.util.LinkedList;
import java.util.List;

// Найти самолет в компании, соответствующий заданному диапазону параметров потребления горючего.
public class AircraftFinder {
    public LinkedList<Aircraft> findByFuelConsumption(Airline airline, float minFuelConsumption, float maxFuelConsumption) throws IncorrectValueException {
        if(minFuelConsumption >= 0 && maxFuelConsumption >= 0 && minFuelConsumption <= maxFuelConsumption){
            LinkedList<Aircraft> result = new LinkedList<>();
            List<Aircraft> aircrafts = airline.getAircrafts();
            for(Aircraft aircraft : aircrafts){
                if(aircraft.getFuelConsumption() >= minFuelConsumption && aircraft.getFuelConsumption() <= maxFuelConsumption){
                    result.add(aircraft);
                }
            }
            return result;
        } else{
            throw new IncorrectValueException("Incorrect arguments");
        }
    }
}
