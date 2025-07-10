package ex1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/time-servlet")
public class TimeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        Date now = new Date(); //lấy thời gian
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet TimeServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Thời gian hiện tại: " + now + "</h1>");
        out.println("</body>");
        out.println("</html>");

    }

}