package airline.entity;

// воздушное судно - базовый абстрактный класс
public abstract class Aircraft {
    private long aircraftId;
    private String name;
    private double flightRange;  // дальность полета
    private double fuelConsumption;  // потребление горючего

    public Aircraft(long aircraftId, String name, double flightRange, double fuelConsumption) {
        this.aircraftId = aircraftId;
        this.name = name;
        this.flightRange = flightRange;
        this.fuelConsumption = fuelConsumption;
    }

    public long getAircraftId() {
        return aircraftId;
    }

    public String getName() {
        return name;
    }

    public double getFlightRange() {
        return flightRange;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
