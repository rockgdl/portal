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
		
		ProductoDao dao=new ProductoDaoSql();
		dao.Agrega(producto);
	}

	@Test
	public void testActualiza() {
		fail("Not yet implemented");
	}

	@Test
	public void testElimina() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenTodos() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenById() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSession() {
		fail("Not yet implemented");
	}

}
