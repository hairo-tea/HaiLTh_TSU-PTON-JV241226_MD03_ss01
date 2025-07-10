package ex2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user-info")
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // gán dữ liệu vào req
        req.setAttribute("id",1);
        req.setAttribute("name","Huấn");
        req.setAttribute("email","huanrose@gmail.com");
        req.setAttribute("age",18);
        //gửi dữ liệu từ Servlet sang JSP để hiển thị
      RequestDispatcher re = req.getRequestDispatcher("/indexEx2.jsp");
      re.forward(req, resp);

    }

}