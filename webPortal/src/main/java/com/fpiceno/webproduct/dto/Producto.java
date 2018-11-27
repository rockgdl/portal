package com.fpiceno.webproduct.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="producto")
public class Producto {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column (name="codigo")
	private String nombre;
	@Column (name="codigo")
	private Date fechaAlta;
	@Column (name="codigo")
	private Date fechaModificacion;
	@Enumerated(EnumType.STRING)
	private TipoCalidad tipoCalidad;
	@Enumerated(EnumType.STRING)
	private UnidadMedida unidad;
	@Column (name="codigo")
	private String observaciones;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public TipoCalidad getTipoCalidad() {
		return tipoCalidad;
	}
	public void setTipoCalidad(TipoCalidad tipoCalidad) {
		this.tipoCalidad = tipoCalidad;
	}
	public UnidadMedida getUnidad() {
		return unidad;
	}
	public void setUnidad(UnidadMedida unidad) {
		this.unidad = unidad;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	

}
