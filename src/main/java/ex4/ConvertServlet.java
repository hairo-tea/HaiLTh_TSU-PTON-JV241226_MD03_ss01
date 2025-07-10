package ex4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/convert")
public class ConvertServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String rateString = req.getParameter("rate");
        String usdString = req.getParameter("usd");

        try{
            double rate = Double.parseDouble(rateString);
            double usd = Double.parseDouble(usdString);
            double vnd = usd * rate;

            //gửi dữ liệu sang trang jsp
            req.setAttribute("rate", rate);
            req.setAttribute("usd", usd);
            req.setAttribute("vnd", vnd);

            req.getRequestDispatcher("indexEx4.jsp").forward(req, resp);

        }catch (Exception e){
            e.printStackTrace();
        }

    }


}
