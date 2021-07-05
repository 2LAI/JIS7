package homework.lectures.jdbc.service;

import homework.lectures.model.Customer;

import java.sql.SQLException;
import java.util.Collection;

public interface CustomerService {

    Customer create(String firstName, String lastName, String email, String phoneNumber) throws SQLException, ClassNotFoundException;

    Collection<Customer> findAll() throws SQLException, ClassNotFoundException;

    Customer update(Customer customer) throws SQLException, ClassNotFoundException;

    Customer getById(Integer id) throws SQLException, ClassNotFoundException;

    Customer removeById(Integer id) throws SQLException, ClassNotFoundException;


}