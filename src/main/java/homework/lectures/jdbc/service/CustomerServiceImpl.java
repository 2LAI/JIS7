package homework.lectures.jdbc.service;

import homework.lectures.jdbc.dbconfig.Connector;
import homework.lectures.model.Customer;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public Customer create(String firstName, String lastName, String email, String phoneNumber) throws SQLException, ClassNotFoundException {

        var connection = Connector.getConnection();

        String sql1 = "INSERT INTO \"customer\" (first_name, last_name, email, phone_number) VALUES (?, ?, ?, ?)";

        PreparedStatement statement = connection.prepareStatement(sql1);

        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.setString(3, email);
        statement.setString(4, phoneNumber);

        int rowsInserted = statement.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("A new customer was inserted successfully!");
        }
        statement.close();
        connection.close();

        return new Customer(firstName, lastName, email, phoneNumber);
    }

    @Override
    public Collection<Customer> findAll() throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Customer update(Customer customer) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Customer getById(Integer id) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Customer removeById(Integer id) throws SQLException, ClassNotFoundException {
        return null;
    }
}
