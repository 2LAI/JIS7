package homework.lectures.hibernate.src.main.superclass.java;

import homework.lectures.hibernate.src.main.superclass.java.service.AircraftService;
import homework.lectures.hibernate.src.main.superclass.java.service.AircraftServiceImp;

public class Runner {
    public static void main(String[] args) {
        AircraftService aircraftService = new AircraftServiceImp();
        aircraftService.createHelicopter("H130", 6.3, true);
        aircraftService.createPlane("747", 14.0,true);
    }
}
