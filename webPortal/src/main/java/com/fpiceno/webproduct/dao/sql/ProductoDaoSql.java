package com.fpiceno.webproduct.dao.sql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
//		 Transaction tx;
		 Session sesion = null;
		 SessionFactory sessionFactoryTest=null;
		 sessionFactoryTest= new Configuration().configure("com/fpiceno/webproduct/configuracion/hibernateSql.cfg.xml").buildSessionFactory();
//			sessionFactory=new Configuration().configure(_archivo).buildSessionFactory();
//			LOG.info("TEST UNITARIOS SI DA ESTE ERROR HAY QUE CORREGIR EL OBJETO DEL DAO ");
		 sesion = sessionFactoryTest.getCurrentSession();
//		 tx = sesion.beginTransaction();
//		 tx.commit();
		
			
			return sesion;
	}

}
