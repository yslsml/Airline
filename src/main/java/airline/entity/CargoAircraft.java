package airline.entity;

public class CargoAircraft extends Aircraft{
    private double loadCapacity;  // грузоподъемность

    public CargoAircraft(long aircraftId, String name, double flightRange, double fuelConsumption, double loadCapacity) {
        super(aircraftId, name, flightRange, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "\nCargo Aircraft {" +
                "\n id = " + getAircraftId() +
                "\n name = " + getName() +
                "\n flight range = " + getFlightRange() +
                "\n fuel consumption = " + getFuelConsumption() +
                "\n load capacity = " + loadCapacity +
                "\n}";
    }
}
