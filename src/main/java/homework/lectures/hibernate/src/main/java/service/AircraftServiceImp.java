package homework.lectures.hibernate.src.main.java.service;

import homework.lectures.hibernate.src.main.java.configuration.HibernateSessionFactoryUtil;
import homework.lectures.hibernate.src.main.java.model.Aircraft;
import homework.lectures.hibernate.src.main.java.model.Plane;

public class AircraftServiceImp implements AircraftService {

    @Override
    public Aircraft createPlane(String modelName, Double maxAltitude, Boolean horizontalTakeOff) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Aircraft plane = new Plane(modelName, maxAltitude, horizontalTakeOff);
        var transaction = session.beginTransaction();
        session.save(plane);
        transaction.commit();
        session.close();
        return plane;
    }

    @Override
    public Aircraft createHelicopter(String modelName, Double maxAltitude, Boolean verticalTakeOff) {
        var session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Aircraft helicopter = new Plane(modelName, maxAltitude, verticalTakeOff);
        var transaction = session.beginTransaction();
        session.save(helicopter);
        transaction.commit();
        session.close();
        return helicopter;
    }
}
