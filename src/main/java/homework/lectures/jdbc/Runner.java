package homework.lectures.jdbc;

import homework.lectures.jdbc.service.CustomerService;
import homework.lectures.jdbc.service.CustomerServiceImpl;
import homework.lectures.model.Customer;
import homework.lectures.utils.functions.ReadLineConsole;
import org.apache.log4j.Logger;

import java.sql.SQLException;
import java.util.Collection;

public class Runner {

    private static final Logger log = Logger.getLogger(Runner.class);

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        CustomerService customerService = new CustomerServiceImpl();

        //Create customer
        Customer customer = customerService.create("Alexandr", "Tulai", "AT@gmail.com", "777");
        log.info(customer);

        //Find all customers
        Collection<Customer> allCustomers = customerService.findAll();
        log.info(allCustomers.toString());

        updateCustomer(customerService, allCustomers);

        //Get customer by ID
        log.info("Enter id to find: ");
        var customerId = Integer.parseInt(ReadLineConsole.consoleReadline());
        log.info(customerService.getById(customerId));

        //Delete customer
        log.info("Enter id to delete: ");
        var customerIdDelete = Integer.parseInt(ReadLineConsole.consoleReadline());
        log.info(customerService.removeById(customerIdDelete));

        //Get customer by special requirement
        log.info("Customers with the First name which starts from 'A' and ended as 'R': " + customerService.findByLetters());

    }

    private static void updateCustomer(CustomerService customerService, Collection<Customer> allCustomers) throws SQLException, ClassNotFoundException {
        log.info("Enter id of customer to update this customer");
        var customerId = Integer.parseInt(ReadLineConsole.consoleReadline());

        log.info("Enter new First name for customer");
        var newFirstName = ReadLineConsole.consoleReadline();

        log.info("Enter new Last name for customer");
        var newLastName = ReadLineConsole.consoleReadline();

        log.info("Enter new Email for customer");
        var newEmailName = ReadLineConsole.consoleReadline();

        log.info("Enter new Phone number for customer");
        var newPhoneNumber = ReadLineConsole.consoleReadline();

        Customer newCustomer = new Customer(newFirstName, newLastName, newEmailName, newPhoneNumber);

        Customer updatedCustomer = customerService.update(newCustomer, customerId);

        log.info("Customer has been changed");
        log.info(updatedCustomer.toString());
        log.info(allCustomers);
    }
}
