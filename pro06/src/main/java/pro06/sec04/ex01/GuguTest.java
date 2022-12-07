package pro06.sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/gugu")
public class GuguTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("gugu init 메서드 호출");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charsset=utf-8");
		PrintWriter out = response.getWriter();
		int dan = Integer.parseInt(request.getParameter("dan"));
		out.print("<table border=1 width=400 align=center>");
		out.print("<tr align=center bgcolor='#CFE8FD'>");
		out.print("<td colspan=2>" + dan + " dan </td>");
		out.print("</tr>");
		for (int i = 1; i < 10; i++) {
			out.print("<tr align=center>");
			out.print("<td width=200>");
			out.print(dan + "  X  " + i);
			out.print("</td>");
			out.print("<td width=200>");
			out.print(i * dan);
			out.print("</td>");
			out.print("</tr>");
		}
		out.print("</table>"); 
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
}
