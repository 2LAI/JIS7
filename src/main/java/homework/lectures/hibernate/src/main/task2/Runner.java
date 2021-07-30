package homework.lectures.hibernate.src.main.task2;

import homework.lectures.hibernate.src.main.task2.service.CustomerService;
import homework.lectures.hibernate.src.main.task2.service.CustomerServiceImpl;

import java.sql.SQLException;

public class Runner {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        CustomerService customerService = new CustomerServiceImpl();
        System.out.println(customerService.create("Alexadr", "Tulai", "AG@gmail.com", "777"));

    }
}
