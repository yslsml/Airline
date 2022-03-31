package airline.entity;

public class PassengerAircraft extends Aircraft{
    private int numberOfSeats;

    public PassengerAircraft(long aircraftId, String name, double flightRange, double fuelConsumption, int numberOfSeats) {
        super(aircraftId, name, flightRange, fuelConsumption);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String toString() {
        return "\nPassenger Aircraft {" +
                "\n id = " + getAircraftId() +
                "\n name = " + getName() +
                "\n flight range = " + getFlightRange() +
                "\n fuel consumption = " + getFuelConsumption() +
                "\n number of seats = " + numberOfSeats +
                "\n}";
    }
}
