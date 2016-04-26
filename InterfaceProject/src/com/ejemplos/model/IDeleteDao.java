package com.ejemplos.model;

public interface IDeleteDao<T> {

	public boolean delete(String t);
	public boolean deleteAll();
}
