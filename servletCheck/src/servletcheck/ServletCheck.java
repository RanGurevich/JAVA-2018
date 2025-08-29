   import java.io.*;
   import javax.servlet.*;
   import javax.servlet.http.*;

	public class FirstServlet extends HttpServlet
	{
	protected void service(
	HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException
	{
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	out.println("<html><head>");
	out.println("<title>First Servlet !</title>");
	out.println("</head><body>");
	out.println("<h1>First Servlet !</h1>");
	out.println("</body></html>");
	}
 } 
