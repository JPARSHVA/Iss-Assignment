package first;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Check credentials (this is a basic example, you should verify against a database)
        if ("username".equals(username) && "password".equals(password)) {
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);

            request.getSession().setAttribute("user", user);
            response.sendRedirect("welcome.jsp");
        } else {
            request.setAttribute("errorMessage", "Invalid credentials");
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
    }
}
