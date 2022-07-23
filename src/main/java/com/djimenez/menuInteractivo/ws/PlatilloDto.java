package com.djimenez.menuInteractivo.ws;

import java.io.Serializable;

public class PlatilloDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3319257773953224317L;
	
	private Integer idPlatillo;
	private String nombre;
	private String descripcion;
	private double precio;
	public Integer getIdPlatillo() {
		return idPlatillo;
	}
	public void setIdPlatillo(Integer idPlatillo) {
		this.idPlatillo = idPlatillo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	

}
