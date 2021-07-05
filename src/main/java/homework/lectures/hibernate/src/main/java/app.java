package homework.lectures.hibernate.src.main.java;

import homework.lectures.hibernate.src.main.java.service.AircraftService;
import homework.lectures.hibernate.src.main.java.service.AircraftServiceImp;

public class app {
    public static void main(String[] args) {
        AircraftService aircraftService = new AircraftServiceImp();
        aircraftService.createHelicopter("747", 14.3, true);
    }
}
