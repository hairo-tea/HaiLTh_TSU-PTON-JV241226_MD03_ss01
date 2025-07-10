package ex6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    private static final String EMAIL_REGEX = "^[\\w.-]+@[\\w.-]+\\.(com|vn|net|org|edu)$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    private static final String PASSWORD_REGEX =
            "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?]).{8,}$";

    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmPassword");

        Map<String, String> errors = new HashMap<>();
        //validate username
        if(username == null || username.trim().isEmpty()) {
            errors.put("username", "Username is required");
        }

        // Validate email
        if (email == null || email.trim().isEmpty()) {
            errors.put("email", "Email is required");
        } else if (!EMAIL_PATTERN.matcher(email).matches()) {
            errors.put("email", "Email not valid");
        }

        // Validate password
        if (password == null || password.isEmpty()) {
            errors.put("password", "Password is required");
        } else if (!PASSWORD_PATTERN.matcher(password).matches()) {
            errors.put("password", "Password not valid");
        }

        // Validate confirm password
        if (confirmPassword == null || confirmPassword.isEmpty()) {
            errors.put("confirmPassword", "Confirm Password is required");
        } else if (!confirmPassword.equals(password)) {
            errors.put("confirmPassword", "Confirm Password does not match");
        }

        if (errors.isEmpty()) {
            // Đăng ký thành công, hiển thị thông báo
            req.setAttribute("successMessage", "Registered Successfully!");
        } else {
            // Có lỗi, trả lại lỗi lên JSP
            req.setAttribute("errors", errors);
        }

        req.getRequestDispatcher("indexEx6.jsp").forward(req, resp);
    }
}
