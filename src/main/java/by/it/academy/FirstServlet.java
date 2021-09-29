package by.it.academy;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse resp)
            throws IOException
    {
        resp.setContentType("text/html");
        resp.getWriter().write("Hello First XML Servlet ");
        HttpSession session = request.getSession();
        Long visitCounter = (Long) session.getAttribute("visitCounter");
        if (visitCounter == null) {
            visitCounter = 1L;
        } else {
            visitCounter++;
        }
        session.setAttribute("visitCounter", visitCounter);

        try (PrintWriter writer = resp.getWriter()) {
            writer.println("Page was visited " + visitCounter + " times."+"\n"+
                    "Name of current Thread  "+Thread.currentThread().getName());
        }
    }
}
