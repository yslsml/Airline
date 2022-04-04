package airline.entity;

import airline.excepcion.InvalidDataException;

import java.util.LinkedList;

public class Airline {
    private LinkedList<Aircraft> aircrafts;

    public Airline(LinkedList<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
    }

    public Airline(){
        this.aircrafts = new LinkedList<>();
    }

    public void addAircraft(Aircraft aircraft){
        aircrafts.addLast(aircraft);
    }

    public LinkedList<Aircraft> getAircrafts(){
        return this.aircrafts;
    }

    //Метод нужен, чтобы перезанести ту же коллекцию, но в другом порядке, например, отсортированную.
    //Просто перезанести новую коллекцию, с новыми, другими членами этим методом нельзя.
    public void setAircrafts(LinkedList<Aircraft> aircrafts) throws InvalidDataException {
        if(this.aircrafts.containsAll(aircrafts) && aircrafts.containsAll(this.aircrafts)){
            this.aircrafts = aircrafts;
        }
        else{
            throw new InvalidDataException("Contain of airline can not be change with method setAircraft");
        }
    }

}
