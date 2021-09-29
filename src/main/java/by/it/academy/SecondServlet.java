package by.it.academy;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "SecondServlet", urlPatterns = {"/second"})
public class SecondServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse resp)
            throws IOException
    {
        resp.setContentType("text/html");
        resp.getWriter().write("Hello Second Annotations Servlet");
    }
}
