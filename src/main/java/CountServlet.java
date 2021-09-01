import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "CountServlet", urlPatterns = "/count")
public class CountServlet extends HttpServlet {
    int timesVisited = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String reset = request.getParameter("reset");
        timesVisited++;

        if(reset.equals("letsreset")){
            timesVisited = 0;
        }
        out.println(timesVisited);
    }
}