package homework.lectures.jdbc.service;

import homework.lectures.jdbc.model.Customer;

import java.sql.SQLException;
import java.util.Collection;

public interface CustomerService {

    Customer create(String firstName, String lastName, String email, String phoneNumber) throws SQLException, ClassNotFoundException;

    Collection<Customer> findAll() throws SQLException, ClassNotFoundException;

    Customer update(Customer customer, Integer id) throws SQLException, ClassNotFoundException;

    Customer getById(Integer id) throws SQLException, ClassNotFoundException;

    Customer removeById(Integer id) throws SQLException, ClassNotFoundException;

    Collection<Customer> findByLetters() throws SQLException, ClassNotFoundException;

}