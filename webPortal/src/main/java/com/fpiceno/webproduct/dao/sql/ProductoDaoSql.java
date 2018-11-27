package com.fpiceno.webproduct.dao.sql;

import java.util.List;

import org.hibernate.Session;

import com.fpiceno.webproduct.dao.ProductoDao;
import com.fpiceno.webproduct.dto.Producto;

public class ProductoDaoSql implements ProductoDao {

	@Override
	public Integer Agrega(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Actualiza(Producto producto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void Elimina(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Producto> obtenTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto obtenById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Producto obtenByName(Producto producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Session getSession() {
		// TODO Auto-generated method stub
		return null;
	}

}
