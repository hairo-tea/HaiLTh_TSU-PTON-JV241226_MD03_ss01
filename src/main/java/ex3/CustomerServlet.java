package ex3;

import dao.CustomerDao;
import entity.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/customers")
public class CustomerServlet extends HttpServlet {
    private  CustomerDao customerDao;
    public void init() throws ServletException {
        customerDao = new CustomerDao();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = null;
        try {
            customers = customerDao.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("/indexEx3.jsp").forward(request, response);

    }

}
