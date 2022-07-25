package com.djimenez.menuInteractivo.vista;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import com.djimenez.menuInteractivo.controlador.MotoristaControlador;
import com.djimenez.menuInteractivo.controlador.impl.MotoristaControladorImpl;
import com.djimenez.menuInteractivo.modelo.entidad.Motorista;

@ManagedBean
@ViewScoped
public class MotoristaVista implements Serializable {

	private static final long serialVersionUID = 1L;
	private String cedula;
	private String nombre;
	private String apellido;
	private String correo;
	private String telefono;
	private String contrasenia;
	private boolean estado;
	private Motorista nuevoMotorista = new Motorista();
	private Motorista actualizarMotorista, eliminarMotorista;
	private List<Motorista> listarMotoristas;
	private MotoristaControlador motoristaControlador;

	public MotoristaVista() {

	}

	@PostConstruct
	public void init() {
		motoristaControlador = new MotoristaControladorImpl();
		listarMotoristas = new ArrayList<Motorista>();
		listarMotoristas();
		limpiarDatos();

	}

	public void insertarMotorista() {
		try {
			if (nuevoMotorista.getIdMotorista() == null) {
				nuevoMotorista.setEstado(true);
				nuevoMotorista.setContrasenia(claveEncriptadaSHA1(contrasenia));
				motoristaControlador.insertarMotorista(nuevoMotorista);
				limpiarDatos();
			} else {
				if (contrasenia != null) {
					nuevoMotorista.setContrasenia(claveEncriptadaSHA1(contrasenia));
				}
				motoristaControlador.actualizarMotorista(nuevoMotorista);
			}
			listarMotoristas();
			limpiarDatos();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_INFO, "Motorista Registrado", ""));
		} catch (Exception e) {
			limpiarDatos();
			FacesContext.getCurrentInstance().addMessage(null,
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "No se pudo Registrar", ""));

		}

	}

	public void listarMotoristas() {
		listarMotoristas = motoristaControlador.listarMotorista();
	}

	public void eliminarMotorista() {
		eliminarMotorista.setEstado(false);
		motoristaControlador.eliminarMotorista(eliminarMotorista);
		listarMotoristas();
		limpiarDatos();
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Motorista Eliminado", ""));
	}

	public void limpiarDatos() {
		cedula = "";
		nombre = "";
		apellido = "";
		correo = "";
		telefono = "";
		contrasenia = "";
		nuevoMotorista = new Motorista();
	}

	public static String claveEncriptadaSHA1(String password) {
		try {
			byte[] buffer = password.getBytes();
			MessageDigest md = MessageDigest.getInstance("SHA-1");
			md.update(buffer);
			String valorHash = "";
			for (byte aux : md.digest()) {
				int b = aux & 0xff;
				if (Integer.toHexString(b).length() == 1) {
					valorHash += "0";
				}
				valorHash += Integer.toHexString(b);
			}
			return valorHash;
		} catch (NoSuchAlgorithmException e) {
			// TODO: handle exception
			throw new RuntimeException(e);
		}
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Motorista getNuevoMotorista() {
		return nuevoMotorista;
	}

	public void setNuevoMotorista(Motorista nuevoMotorista) {
		this.nuevoMotorista = nuevoMotorista;
	}

	public Motorista getActualizarMotorista() {
		return actualizarMotorista;
	}

	public void setActualizarMotorista(Motorista actualizarMotorista) {
		this.actualizarMotorista = actualizarMotorista;
	}

	public Motorista getEliminarMotorista() {
		return eliminarMotorista;
	}

	public void setEliminarMotorista(Motorista eliminarMotorista) {
		this.eliminarMotorista = eliminarMotorista;
	}

	public List<Motorista> getListarMotoristas() {
		return listarMotoristas;
	}

	public void setListarMotoristas(List<Motorista> listarMotoristas) {
		this.listarMotoristas = listarMotoristas;
	}

	public MotoristaControlador getMotoristaControlador() {
		return motoristaControlador;
	}

	public void setMotoristaControlador(MotoristaControlador motoristaControlador) {
		this.motoristaControlador = motoristaControlador;
	}

}
