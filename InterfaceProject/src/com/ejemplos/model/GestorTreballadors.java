package com.ejemplos.model;

import java.io.IOException;
import java.sql.SQLException;

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
		/*try{
			dao.insertRecordIntoDbUserTable(dao.getConnection(), "treballadors2",treb);
		}
		catch (SQLException e){
			e.getMessage();
		}*/
		
		if (request.getParameter("submitAdd") != null) {
			dao.create(treb);
		} 
		else if (request.getParameter("Borrar") != null) {
			dao.delete(request.getParameter("dni").toString());
		} 
		else if (request.getParameter("borrTb") != null) {
			dao.deleteAll();
		} 
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
