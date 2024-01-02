package first;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get registration details from the form
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Save user details (for simplicity, this is not connected to a database)
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        request.getSession().setAttribute("user", user);
        response.sendRedirect("welcome.jsp");
    }
}
