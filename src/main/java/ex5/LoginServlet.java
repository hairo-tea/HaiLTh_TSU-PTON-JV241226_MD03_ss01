package ex5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
//    private static final String USERNAME = "NguyenVanA";
//    private static final String PASSWORD = "matkhauco8kytu";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if("NguyenVanA".equals(username) && "matkhauco8kytu".equals(password)){
            //đăng nhập thành công chuyển trang tới trang home.jsp
            req.getRequestDispatcher("home.jsp").forward(req, resp);
        }else{
            //đăng nhập thất bại
            req.setAttribute("error", "Invalid username or password");
            req.getRequestDispatcher("indexEx5.jsp").forward(req, resp);
        }
    }
}
