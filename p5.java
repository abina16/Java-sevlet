import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class Pleasse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final String count="Counter.count";
    public Pleasse() {
        super();
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int c = 1;
        HttpSession session = request.getSession(true);
        Integer i = (Integer) session.getAttribute("count");
        if (i != null) {
            c = i.intValue() + 1;
        }
        session.setAttribute("count", c);
        out.println("<html><head><title>SESSION TRACKER</title></head><body>");
        out.println("<center>SESSION TRACKER</center><br>");
        out.println("<head>SESSION ID:</head>" + session.getId() + "<br>");
        out.println("<head>NUMBER OF TIMES THE PAGE IS HIT: " + c + "</head><br>");
        out.flush();
        out.println("</body></html>");
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
