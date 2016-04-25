

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GestorEmpleat
 */
public class GestorEmpleat extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestorEmpleat() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String nom = request.getParameter("nom");
		String cog1 = request.getParameter("cognom1");
		String cog2 = request.getParameter("cognom2");
		String email = request.getParameter("email");
		String tlf = request.getParameter("tlf");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title> Empleats </title></head>");
		out.println("<body>"); 
		out.println(nom);
		out.println(cog1);
		out.println(cog2);
		out.println(email);
		out.println(tlf);
		out.println("</body>");
		out.println("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Empleat empl = new Empleat();
		if(request.getParameter("nom")!=null){
			empl.setName(request.getParameter("nom"));
			empl.setCognom1(request.getParameter("cognom1"));
			empl.setCognom2(request.getParameter("cognom2"));
			empl.setEMail(request.getParameter("email"));
			empl.setTelefon(request.getParameter("tlf"));
		}
		
		request.setAttribute("empl", empl);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Database.jsp");
		dispatcher.forward(request, response);
	}

}
