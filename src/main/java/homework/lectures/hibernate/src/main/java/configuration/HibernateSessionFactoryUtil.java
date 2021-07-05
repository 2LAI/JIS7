package homework.lectures.hibernate.src.main.java.configuration;

import homework.lectures.hibernate.src.main.java.model.Aircraft;
import homework.lectures.hibernate.src.main.java.model.Helicopter;
import homework.lectures.hibernate.src.main.java.model.Plane;
import lombok.SneakyThrows;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.FileReader;
import java.util.Properties;

public class HibernateSessionFactoryUtil {

    private static SessionFactory sessionFactory;

    @SneakyThrows
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            properties.load(new FileReader("src\\main\\java\\homework\\lectures\\hibernate\\src\\main\\resources\\hibernate.properties"));
            configuration.setProperties(properties);
            configuration.addAnnotatedClass(Aircraft.class);
            configuration.addAnnotatedClass(Helicopter.class);
            configuration.addAnnotatedClass(Plane.class);
            var serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;

    }
}
