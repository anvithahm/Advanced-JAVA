import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class e1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		int e="403";
		res.setContentType("text/html");
		String name=req.getParameter("t1");
		String pas=req.getParameter("t2");
		if(name.equals("felo")&&pas.equals("@123"))
		{
			String url=res.encodeRedirectURL("Home");
			res.sendRedirect(url);
		}
		else
		{
			res.sendError(e,"Incorrect");
		}
	}
}