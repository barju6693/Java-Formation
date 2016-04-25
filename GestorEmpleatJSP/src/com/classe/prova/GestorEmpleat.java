package com.classe.prova;


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
		Empleat empl = new Empleat(request.getParameter("nom"), request.getParameter("cognom1"),
				request.getParameter("cognom2"), request.getParameter("email"), request.getParameter("tlf"));
		empl.addEmpleat();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title> Empleats </title></head>");
		out.println(empl.getName());
		out.println(empl.Cognom1 + empl.Cognom2);
		out.println("</html>");
		
		request.setAttribute("empl", empl);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Database.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
