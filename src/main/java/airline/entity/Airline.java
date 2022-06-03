package airline.entity;

import airline.excepcion.InvalidDataException;

import java.util.LinkedList;

//Посчитать общую вместимость и грузоподъемность.
public class Airline {
    private LinkedList<Aircraft> aircrafts;
    private double totalLoadCapacity;
    private int totalNumberOfSeats;

    public Airline(LinkedList<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
        for(Aircraft aircraft : aircrafts) {
            if (aircraft instanceof CargoAircraft) {
                this.totalLoadCapacity += ((CargoAircraft) aircraft).getLoadCapacity();
            }
            if (aircraft instanceof PassengerAircraft) {
                this.totalNumberOfSeats += ((PassengerAircraft) aircraft).getNumberOfSeats();
            }
        }
    }

    public Airline(){
        this.aircrafts = new LinkedList<>();
        this.totalLoadCapacity = 0;
        this.totalNumberOfSeats = 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Airline clone() throws CloneNotSupportedException {
        return (Airline)super.clone();
    }

    public void addAircraft(Aircraft aircraft){
        aircrafts.addLast(aircraft);
        if (aircraft instanceof CargoAircraft) {
            this.totalLoadCapacity += ((CargoAircraft) aircraft).getLoadCapacity();
        }
        if (aircraft instanceof PassengerAircraft) {
            this.totalNumberOfSeats += ((PassengerAircraft) aircraft).getNumberOfSeats();
        }
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
