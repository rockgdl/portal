package com.fpiceno.webproduct.dao.sql;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fpiceno.webproduct.dao.ProductoDao;
import com.fpiceno.webproduct.dto.Producto;

public class ProductoDaoSql implements ProductoDao {

	@Override
	public Integer Agrega(Producto producto) {
		   Session session=getSession();
		   Transaction tx=session.beginTransaction();
		  Integer id=(Integer) session.save(producto);
		  tx.commit();
		  return id;
	}

	@Override
	public void Actualiza(Producto producto) {
		   Session session=getSession();
		   Transaction tx=session.beginTransaction();
		   session.update(producto);
		   tx.commit();
	}

	@Override
	public void Elimina(Integer id) {
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		   session.delete(id);
		   trans.commit();
	}

	@Override
	public List<Producto> obtenTodos() {
//		LOG.debug("REGRESANDO LA LISTA DE COLONIA ");
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		Query query=session.createQuery("from Producto");
		ArrayList<Producto> lista = (ArrayList<Producto>) query.list();
		trans.commit();
		return lista;
	}

	@Override
	public Producto obtenById(Integer id) {
//		LOG.info("OBTENER COLONIA POR ID  ");
		   Session session=getSession();
		   Transaction trans=session.beginTransaction();
		   Producto producto=new Producto();
		producto =  (Producto) session.get(Producto.class, id);
		trans.commit();
		return producto;
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
