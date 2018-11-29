package com.fpiceno.webproduct.dao;

import java.util.List;

import org.hibernate.Session;

import com.fpiceno.webproduct.dto.Producto;

public interface ProductoDao {
	
	
	public Integer Agrega(Producto producto);
	public void Actualiza (Producto producto);
	public void Elimina(Producto producto);
	public List<Producto>obtenTodos();
	public Producto obtenById(Integer id);
	public Producto obtenByName(Producto producto);
	public Session getSession();

}
