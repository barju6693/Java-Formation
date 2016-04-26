package com.ejemplos.model;

public interface IDeleteDao<T> {

	public boolean delete(T t);
	public boolean deleteAll();
}
