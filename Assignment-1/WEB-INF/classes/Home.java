import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class e1 extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
	{
		try
		{
		
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		HttpSession s=req.getSession();
		if(s.getAttribute("name")==null)
		{
			String url=res.encodeRedirectURL("a.html");
			res.sendRedirect(url);
		}
		pw.println("login successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}