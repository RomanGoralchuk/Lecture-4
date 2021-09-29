package by.it.academy;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse resp)
            throws IOException
    {
        resp.setContentType("text/html");
        resp.getWriter().write("Hello Servlet 1");
    }
}
