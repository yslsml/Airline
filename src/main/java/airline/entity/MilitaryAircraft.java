package airline.entity;

public class MilitaryAircraft extends CargoAircraft{
    private int numberOfBombs;  // количество бомб

    public MilitaryAircraft(long aircraftId, String name, double flightRange, double fuelConsumption, double loadCapacity, int numberOfBombs) {
        super(aircraftId, name, flightRange, fuelConsumption, loadCapacity);
        this.numberOfBombs = numberOfBombs;
    }

    public int getNumberOfBombs() {
        return numberOfBombs;
    }

    @Override
    public String toString() {
        return "\nMilitary Aircraft {" +
                "\n id = " + getAircraftId() +
                "\n name = " + getName() +
                "\n flight range = " + getFlightRange() +
                "\n fuel consumption = " + getFuelConsumption() +
                "\n load capacity = " + getLoadCapacity() +
                "\n number of bombs = " + numberOfBombs +
                "\n}";
    }
}
