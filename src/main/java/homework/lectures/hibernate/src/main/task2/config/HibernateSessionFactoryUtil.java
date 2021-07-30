package homework.lectures.hibernate.src.main.task2.config;

import homework.lectures.hibernate.src.main.task2.model.Customer;
import homework.lectures.hibernate.src.main.task2.model.Order;
import homework.lectures.hibernate.src.main.task2.model.Product;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HibernateSessionFactoryUtil {

    private static SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            Properties properties = new Properties();
            try {
                properties.load(new FileReader("src\\main\\java\\homework\\lectures\\hibernate\\src\\main\\superclass\\resources\\hibernate.properties"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            configuration.setProperties(properties);
            configuration.addAnnotatedClass(Customer.class);
            configuration.addAnnotatedClass(Order.class);
            configuration.addAnnotatedClass(Product.class);
            var serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();

            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;

    }
}
