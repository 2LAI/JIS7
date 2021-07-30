package homework.lectures.jdbc.service;

import homework.lectures.jdbc.dbconfig.Connector;
import homework.lectures.jdbc.model.Customer;
import org.apache.log4j.Logger;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import static homework.lectures.jdbc.dbconfig.Connector.getConnection;

public class CustomerServiceImpl implements CustomerService {

    private static final Logger log = Logger.getLogger(CustomerServiceImpl.class);

    @Override
    public Customer create(String firstName, String lastName, String email, String phoneNumber) throws SQLException, ClassNotFoundException {

        var connection = getConnection();

        var sql = "INSERT INTO \"customer\" (first_name, last_name, email, phone_number) VALUES (?, ?, ?, ?)";

        var statement = connection.prepareStatement(sql);

        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.setString(3, email);
        statement.setString(4, phoneNumber);

        var rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new customer was inserted successfully!");
        }
        statement.close();
        connection.close();

        return new Customer(firstName, lastName, email, phoneNumber);
    }

    @Override
    public Collection<Customer> findAll() throws SQLException, ClassNotFoundException {
        var sql = "SELECT * FROM \"customer\";";
        return getCustomers(sql);
    }

    @Override
    public Collection<Customer> findByLetters() throws SQLException, ClassNotFoundException {
        var sql = "SELECT * FROM \"customer\" WHERE first_name LIKE 'A%' AND first_name LIKE '%r'";
        return getCustomers(sql);
    }

    @Override
    public Customer update(Customer customer, Integer id) throws SQLException, ClassNotFoundException {
        var sql = "UPDATE \"customer\" SET first_name = ?, last_name = ?, email = ?, phone_number = ? WHERE id = " + id;
        updateCustomer(customer, sql);
        return customer;
    }

    @Override
    public Customer getById(Integer id) throws SQLException, ClassNotFoundException {
        var statement = Connector.getStatement();
        var sql = "SELECT * FROM \"customer\" WHERE id = " + id;

        var resultSet = statement.executeQuery(sql);
        var customer = new Customer();

        if (resultSet.next()) {
            customer.setId(id);
            customer.setFirstName(resultSet.getString("first_name"));
            customer.setLastName(resultSet.getString("last_name"));
            customer.setEmail(resultSet.getString("email"));
            customer.setPhoneNumber(resultSet.getString("phone_number"));
        }
        return customer;
    }

    @Override
    public Customer removeById(Integer id) throws SQLException, ClassNotFoundException {
        var customer = getById(id);

        var connection = getConnection();

        var sql = "DELETE FROM \"customer\" WHERE id = " + customer.getId();
        var statement = connection.createStatement();
        statement.execute(sql);

        log.info("Customer with id " + customer.getId() + " has been deleted successfully");
        statement.close();
        connection.close();

        return null;
    }

    private Collection<Customer> getCustomers(String sql) throws SQLException, ClassNotFoundException {
        var statement = Connector.getStatement();
        Collection<Customer> customersList = new ArrayList<>();

        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            Customer customer = new Customer();
            customer.setId(resultSet.getInt("id"));
            customer.setFirstName(resultSet.getString("first_name"));
            customer.setLastName(resultSet.getString("last_name"));
            customer.setEmail(resultSet.getString("email"));
            customer.setPhoneNumber(resultSet.getString("phone_number"));
            customersList.add(customer);
        }

        resultSet.close();
        statement.close();
        statement.getConnection().close();
        return customersList;
    }

    private void updateCustomer(Customer customer, String sql) throws SQLException, ClassNotFoundException {
        var connection = getConnection();
        var statement = connection.prepareStatement(sql);

        statement.setString(1, customer.getFirstName());
        statement.setString(2, customer.getLastName());
        statement.setString(3, customer.getEmail());
        statement.setString(4, customer.getPhoneNumber());

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            log.info("Customer has been updated successfully");
        }
        statement.close();
        connection.close();
    }
}