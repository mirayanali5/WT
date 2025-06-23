import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/test";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "root";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection conn = DriverManager.getConnection(DB_URL, DB_USER,
                    DB_PASS);
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                // Authorized user
                out.println("<h3>Welcome, " + username + "!</h3>");
                // Additional content or redirection to home page
            } else {
                // Unauthorized user
                out.println("<center><h3>Invalid username/password. Please try again.< / h3 > < / center >");
 }
 rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            out.println("Error: " + e.getMessage());
        }
    }
}

// ALTERNATE WAY
// import java.io.IOException;
// import java.io.PrintWriter;
// import javax.servlet.ServletException;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

// public class LoginServlet extends HttpServlet {

//     @Override
//     protected void doPost(HttpServletRequest request, HttpServletResponse response)
//             throws ServletException, IOException {

//         response.setContentType("text/html");
//         PrintWriter out = response.getWriter();

//         String username = request.getParameter("username");
//         String password = request.getParameter("password");

//         String validUsername = getServletConfig().getInitParameter("u");
//         String validPassword = getServletConfig().getInitParameter("p");

//         out.println("<html><body><center><h3>");
//         if (validUsername != null && validPassword != null &&
//             validUsername.equals(username) && validPassword.equals(password)) {
//             out.println("Authorized user");
//         } else {
//             out.println("Unauthorized user");
//         }
//         out.println("</h3></center></body></html>");
//     }
// }
