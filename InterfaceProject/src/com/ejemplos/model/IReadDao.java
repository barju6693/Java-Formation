package com.ejemplos.model;
import java.util.List;
public interface IReadDao<T> {

	public List<T> search(T t);
	public T read(T t);
}
