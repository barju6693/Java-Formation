package com.ejemplos.model;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.Statement;

public class DaoCRUD implements IDaoCRUD<Treballador> {

	@Override
	public boolean delete(String dni) {
		// TODO Auto-generated method stub
		
		try{
			this.deleteRecordFromTable(this.getConnection(), "treballadors2",dni);
		}
		catch (SQLException e){
			e.getMessage();
		}
		
		return false;
	}

	@Override
	public boolean deleteAll() {
		// TODO Auto-generated method stub
		try{
			this.deleteAllFromTable(this.getConnection(), "treballadors2");
		}
		catch (SQLException e){
			e.getMessage();
		}
		return false;
	}

	@Override
	public int create(Treballador t) {
		// TODO Auto-generated method stub
		
		try{
			this.insertRecordIntoDbUserTable(this.getConnection(), "treballadors2",t);
		}
		catch (SQLException e){
			e.getMessage();
		}
		
		return 0;
	}

	@Override
	public List<Treballador> search(Treballador t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Treballador read(String dni) {
		// TODO Auto-generated method stub
		Treballador treb = null;
		try{
			treb = this.selectRecordsFromDbUserTable(this.getConnection(), "treballadors2",dni);
		}
		catch (SQLException e){
			e.getMessage();
		}
		
		return treb;
	}

	@Override
	public int update(Treballador t) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Connection getConnection(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/gestortreballador","root", "");

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
		}

		if (connection != null) {
			System.out.println("You made it, take control your database now!");
		} else {
			System.out.println("Failed to make connection!");
		}
		
		return connection;
	  }
	
	public void insertRecordIntoDbUserTable(Connection dbConnection, String dbName, Treballador treb) throws SQLException {

		Statement statement = null;

		/*String insertTableSQL = "INSERT INTO " + dbName +" (nom, cognom1, cognom2, email, dni, telefon, data-naixement) "+" VALUES ('"+ treb.getName() + "','"
				+ treb.getCognom1() + "','" + treb.getCognom2() + "','" + treb.getEMail() + "','" + treb.getDni() + "','"
				+ treb.getTelefon() + "'," + treb.getDataNaixement() + ");";*/

		try {
			PreparedStatement preparedStatement;
			String insertTableSQL = "INSERT INTO " + dbName 
					+ " (nom, cognom1, cognom2, email, dni, telefon, dataN) VALUES"
					+ "(?,?,?,?,?,?,?)";
			preparedStatement = dbConnection.prepareStatement(insertTableSQL);
			preparedStatement.setString(1, treb.getName());
			preparedStatement.setString(2, treb.getCognom1());
			preparedStatement.setString(3, treb.getCognom2());
			preparedStatement.setString(4, treb.getEMail());
			preparedStatement.setString(5, treb.getDni());
			preparedStatement.setString(6, treb.getTelefon());
			preparedStatement.setDate(7, Date.valueOf(treb.getDataNaixement()));
			
			preparedStatement.executeUpdate();

			System.out.println("Record is inserted into DBUSER table!");

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (statement != null) {
				statement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}
	
	public void deleteRecordFromTable(Connection dbConnection, String dbName, String dni) throws SQLException {

		PreparedStatement preparedStatement = null;

		String deleteSQL = "DELETE FROM " + dbName + " WHERE dni = ?";

		try {
			preparedStatement = dbConnection.prepareStatement(deleteSQL);
			preparedStatement.setString(1, dni);

			// execute delete SQL statement
			preparedStatement.executeUpdate();

			System.out.println("Record is deleted!");
			
		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}
	
	public void deleteAllFromTable(Connection dbConnection, String dbName) throws SQLException {

		PreparedStatement preparedStatement = null;

		String deleteSQL = "DELETE FROM " + dbName;

		try {
			preparedStatement = dbConnection.prepareStatement(deleteSQL);

			// execute delete SQL statement
			preparedStatement.executeUpdate();

			System.out.println("All is deleted!");
			
		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}

	}
	
	
	/*public Treballador selectAllRecordsFromDbUserTable(Connection dbConnection, String dbName) throws SQLException {

		PreparedStatement preparedStatement = null;
		Treballador treb = null;

		String selectTableSQL = "SELECT * FROM "+ dbName;

		try {
			preparedStatement = dbConnection.prepareStatement(selectTableSQL);

			// execute select SQL statement
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				
				treb = new Treballador();
				treb.setID(rs.getInt("id"));
				treb.setName(rs.getString("nom"));
				treb.setCognom1(rs.getString("cognom1"));
				treb.setCognom2(rs.getString("cognom2"));
				treb.setEMail(rs.getString("email"));
				treb.setDni(rs.getString("dni"));
				treb.setTelefon(rs.getString("telefon"));
				treb.setDataNaixement(String.valueOf(rs.getDate("dataN")));

			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}
		
		return treb;

	}*/
	
	public Treballador selectRecordsFromDbUserTable(Connection dbConnection, String dbName, String dni) throws SQLException {

		PreparedStatement preparedStatement = null;
		Treballador treb = null;

		String selectTableSQL = "SELECT * FROM "+ dbName + " WHERE (dni = '" + dni +"');";
		System.out.println(selectTableSQL);
		

		try {
			preparedStatement = dbConnection.prepareStatement(selectTableSQL);

			// execute select SQL statement
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				
				treb = new Treballador();
				treb.setID(rs.getInt("id"));
				treb.setName(rs.getString("nom"));
				treb.setCognom1(rs.getString("cognom1"));
				treb.setCognom2(rs.getString("cognom2"));
				treb.setEMail(rs.getString("email"));
				treb.setDni(rs.getString("dni"));
				treb.setTelefon(rs.getString("telefon"));
				treb.setDataNaixement(String.valueOf(rs.getDate("dataN")));

			}

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				dbConnection.close();
			}

		}
		
		return treb;

	}
	
}
	
