package com.ejemplos.model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GestorTreballadors
 */
public class GestorTreballadors extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestorTreballadors() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Treballador treb = new Treballador();
		
		treb.setName(request.getParameter("nom"));
		treb.setCognom1(request.getParameter("cognom1"));
		treb.setCognom2(request.getParameter("cognom2"));
		treb.setEMail(request.getParameter("email"));
		treb.setTelefon(request.getParameter("tlf"));
		treb.setDni(request.getParameter("dni"));
		treb.setDataNaixement(request.getParameter("dataN"));
		
		System.out.println(treb.toString());
		
		DaoCRUD dao = new DaoCRUD();
		
		if (request.getParameter("submitAdd") != null) {
			dao.create(treb);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		} 
		else if (request.getParameter("submitDelete") != null) {
			dao.delete(request.getParameter("dni").toString());
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		} 
		else if (request.getParameter("borrTb") != null) {
			dao.deleteAll();
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
		} 
		else if (request.getParameter("submitFindByDNI") != null){
			treb = dao.read(request.getParameter("dni"));
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			
			out.println("<html>");
			out.println("<head><title> Empleats </title></head>");
			out.println("<body>"); 
			out.println(treb.getID());
			out.println(treb.getName());
			out.println(treb.getCognom1());
			out.println(treb.getCognom2());
			out.println(treb.getEMail());
			out.println(treb.getDni());
			out.println(treb.getTelefon());
			out.println(treb.getDataNaixement());
			out.println("</body>");
			out.println("</html>");
		}
		
		/*RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);*/
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
