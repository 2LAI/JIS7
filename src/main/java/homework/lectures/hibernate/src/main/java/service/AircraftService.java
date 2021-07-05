package homework.lectures.hibernate.src.main.java.service;

import homework.lectures.hibernate.src.main.java.model.Aircraft;

public interface AircraftService {

    Aircraft createPlane(String modelName, Double maxAltitude, Boolean horizontalTakeOff);

    Aircraft createHelicopter(String modelName, Double maxAltitude, Boolean verticalTakeOff);
}
