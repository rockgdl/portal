package com.fpiceno.webproduct.dao.test;

import static org.junit.Assert.fail;

import java.util.Date;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fpiceno.webproduct.dao.ProductoDao;
import com.fpiceno.webproduct.dao.sql.ProductoDaoSql;
import com.fpiceno.webproduct.dto.Producto;
import com.fpiceno.webproduct.dto.TipoCalidad;
import com.fpiceno.webproduct.dto.UnidadMedida;

public class ProductoDaoSqlTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAgrega() {
		
		Producto producto= new Producto();
		producto.setFechaAlta(new Date());
		producto.setFechaModificacion(new Date());
		producto.setNombre("aguacate");
		producto.setObservaciones("observaciones");
		producto.setTipoCalidad(TipoCalidad.STANDAR);
		producto.setUnidad(UnidadMedida.KG);
		producto.setPrecio(10.22);
		
		ProductoDao dao=new ProductoDaoSql();
		Integer id=dao.Agrega(producto);
		System.out.println(producto);
	}

	@Test
	public void testActualiza() {
		Producto producto= new Producto();
		producto.setId(1);
		producto.setFechaAlta(new Date());
		producto.setFechaModificacion(new Date());
		producto.setNombre("aguacate1");
		producto.setObservaciones("observacione1s");
		producto.setTipoCalidad(TipoCalidad.STANDAR);
		producto.setUnidad(UnidadMedida.KG);
		producto.setPrecio(10.22);
		
		ProductoDao dao=new ProductoDaoSql();
		dao.Actualiza(producto);
		System.out.println(producto);
	}

	@Test
	public void testElimina() {
		Producto producto= new Producto();
		producto.setFechaAlta(new Date());
		producto.setFechaModificacion(new Date());
		producto.setNombre("aguacate");
		producto.setObservaciones("observaciones");
		producto.setTipoCalidad(TipoCalidad.STANDAR);
		producto.setUnidad(UnidadMedida.KG);
		producto.setPrecio(10.22);
		
		ProductoDao dao=new ProductoDaoSql();
		Integer id=dao.Agrega(producto);
		System.out.println(producto);
	}

	@Test
	public void testObtenTodos() {

		Producto producto= new Producto();
		producto.setFechaAlta(new Date());
		producto.setFechaModificacion(new Date());
		producto.setNombre("aguacate");
		producto.setObservaciones("observaciones");
		producto.setTipoCalidad(TipoCalidad.STANDAR);
		producto.setUnidad(UnidadMedida.KG);
		producto.setPrecio(10.22);
		
		ProductoDao dao=new ProductoDaoSql();
		Integer id=dao.Agrega(producto);
		System.out.println(producto);}

	@Test
	public void testObtenById() {

		Producto producto= new Producto();
		producto.setFechaAlta(new Date());
		producto.setFechaModificacion(new Date());
		producto.setNombre("aguacate");
		producto.setObservaciones("observaciones");
		producto.setTipoCalidad(TipoCalidad.STANDAR);
		producto.setUnidad(UnidadMedida.KG);
		producto.setPrecio(10.22);
		
		ProductoDao dao=new ProductoDaoSql();
		Integer id=dao.Agrega(producto);
		System.out.println(producto);}

	@Test
	public void testObtenByName() {

		Producto producto= new Producto();
		producto.setFechaAlta(new Date());
		producto.setFechaModificacion(new Date());
		producto.setNombre("aguacate");
		producto.setObservaciones("observaciones");
		producto.setTipoCalidad(TipoCalidad.STANDAR);
		producto.setUnidad(UnidadMedida.KG);
		producto.setPrecio(10.22);
		
		ProductoDao dao=new ProductoDaoSql();
		Integer id=dao.Agrega(producto);
		System.out.println(producto);}



}
