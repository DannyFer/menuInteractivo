package com.djimenez.menuInteractivo.modelo.entidad;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Combo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCombo;
	private String nombre;
	private String descripcion;
	private double precio;
	private String grafico;
	private boolean estado;

	/*relaciones
	@OneToMany(mappedBy = "fkCombo", cascade = CascadeType.REFRESH)
	private List<Detalle> lstdetalles = new ArrayList<Detalle>();*/

	public Integer getIdCombo() {
		return idCombo;
	}

	public void setIdCombo(Integer idCombo) {
		this.idCombo = idCombo;
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

	public String getGrafico() {
		return grafico;
	}

	public void setGrafico(String grafico) {
		this.grafico = grafico;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

}
