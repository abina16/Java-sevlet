import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
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
    	String na1=request.getParameter("na");
    	String age1=request.getParameter("age");
    	Cookie co=new Cookie(na1,age1);
    	co.setMaxAge(100);
    	response.addCookie(co);
    	PrintWriter out=response.getWriter();
    	try {
          response.setContentType("text/html");
          Cookie[] cok=request.getCookies();
          if(cok==null)
              out.println("no cookie found");
          else
          for(int i=0;i<cok.length;i++)
          {
              Cookie ck=cok[i];
              out.println("<br><b> COOKIE# </b>" + (i+1) +"<br><b> NAME: </b>" +ck.getName());
              out.println("<br>");
              out.println("<br><b> VALUE:</b>" + ck.getValue());
              out.println("<br>");
    	}

    	}
    	finally
    	{
    	out.close();
    	}
    	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
