package com.djimenez.menuInteractivo.modelo.entidad;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ingrediente implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idIngrediente;
	private String nombre;
	private String descripcion;
	private double precio;
	private String grafico;
	private boolean estado;

	// relaciones
	@OneToMany(mappedBy = "fkIngrediente", cascade = CascadeType.REFRESH)
	private List<Detalle> lstdetalles = new ArrayList<Detalle>();

	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
	@JoinColumn(name = "fkCategoria")
	private Categoria fkCategoria;

	public Integer getIdIngrediente() {
		return idIngrediente;
	}

	public void setIdIngrediente(Integer idIngrediente) {
		this.idIngrediente = idIngrediente;
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

	public List<Detalle> getLstdetalles() {
		return lstdetalles;
	}

	public void setLstdetalles(List<Detalle> lstdetalles) {
		this.lstdetalles = lstdetalles;
	}

	public Categoria getFkCategoria() {
		return fkCategoria;
	}

	public void setFkCategoria(Categoria fkCategoria) {
		this.fkCategoria = fkCategoria;
	}

	@Override
	public String toString() {
		return "Ingrediente [idIngrediente=" + idIngrediente + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", precio=" + precio + ", grafico=" + grafico + ", estado=" + estado + ", lstdetalles=" + lstdetalles
				+ ", fkCategoria=" + fkCategoria + ", getIdIngrediente()=" + getIdIngrediente() + ", getNombre()="
				+ getNombre() + ", getDescripcion()=" + getDescripcion() + ", getPrecio()=" + getPrecio()
				+ ", getGrafico()=" + getGrafico() + ", isEstado()=" + isEstado() + ", getLstdetalles()="
				+ getLstdetalles() + ", getFkCategoria()=" + getFkCategoria() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
