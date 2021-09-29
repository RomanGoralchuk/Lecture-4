package by.it.academy;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FirstServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse resp)
            throws IOException
    {
        resp.setContentType("text/html");
        resp.getWriter().write("Hello First XML Servlet");
    }
}
