package by.it.academy;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SecondServlet", urlPatterns = {"/second"})
public class SecondServlet extends HttpServlet {
    private Long accessServerCountGet;
    private Long accessServerCountPost;

    @Override
    public void init() throws ServletException {
        accessServerCountGet = 0L;
        accessServerCountPost = 0L;
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("Hello Second Annotations Servlet ");
        accessServerCountGet++;

        try (PrintWriter printWriter = resp.getWriter()) {
            printWriter.write("Hello I'm servlet  which uses annotation" + "\n" +
                    "Access to server, count: " + accessServerCountGet + "\n" +
                    "Name of current Thread: " + Thread.currentThread().getName());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //someLogic
        accessServerCountPost++;
        try (PrintWriter printWriter = resp.getWriter()) {
            printWriter.write("Access to server, count: " + accessServerCountPost + "\n" +
                    "Name of current Thread: " + Thread.currentThread().getName());
        }
    }


}
