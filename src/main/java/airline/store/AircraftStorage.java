package airline.store;

import airline.entity.Aircraft;
import airline.excepcion.StorageException;

import java.util.LinkedList;

public class AircraftStorage {
    private LinkedList<Aircraft> aircrafts;
    private static final AircraftStorage INSTANCE = new AircraftStorage();

    private AircraftStorage() {
        this.aircrafts = new LinkedList<>();
    }

    public static AircraftStorage getInstance() {
        return INSTANCE;
    }

    public void addAircraft(Aircraft aircraft){
        aircrafts.addLast(aircraft);
    }

    public Aircraft takeAircraft() throws StorageException {
        if(!aircrafts.isEmpty()){
            return aircrafts.removeFirst();
        }else{
            throw new StorageException("AircraftStorage is empty");
        }
    }

    public int countOfSweets(){
        return this.aircrafts.size();
    }

    public boolean isEmpty(){
        return aircrafts.isEmpty();
    }
}
