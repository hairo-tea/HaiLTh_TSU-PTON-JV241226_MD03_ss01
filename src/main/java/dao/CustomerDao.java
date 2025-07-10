package dao;

import entity.Customer;
import util.ConnectionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {
    public List<Customer> findAll() throws SQLException {
        List<Customer> customers = new ArrayList<>();
        String sql = "select * from customer";
        try (
                Connection conn = ConnectionDB.openConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setName(rs.getString("name"));
                customer.setDateOfBirth(rs.getDate("dateOfBirth"));
                customer.setAddress(rs.getString("address"));
                customer.setImage(rs.getString("image"));
                customers.add(customer);
            }
            return customers;
        }
    }
}
