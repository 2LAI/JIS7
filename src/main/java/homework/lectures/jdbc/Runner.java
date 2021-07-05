package homework.lectures.jdbc;

import homework.lectures.jdbc.service.CustomerService;
import homework.lectures.jdbc.service.CustomerServiceImpl;
import homework.lectures.model.Customer;
import org.apache.log4j.Logger;

import java.sql.SQLException;

public class Runner {

    private static final Logger log = Logger.getLogger(Runner.class);

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        CustomerService customerService = new CustomerServiceImpl();

        Customer customer = customerService.create("Alexandr", "Tulai", "AT@gmail.com", "777");
        log.info(customer);

    }
}
