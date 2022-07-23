package com.djimenez.menuInteractivo.controlador;

import java.util.List;
import com.djimenez.menuInteractivo.modelo.entidad.Cliente;

public interface ClienteControlador {

	public void insertarCliente(Cliente nuevoCliente);

	public void actualizarCliente(Cliente actualizarCliente);

	public void eliminarCliente(Cliente eliminarCliente);

	public List<Cliente> listarCliente();
	
	public Cliente buscarPorCorreoCliente(String correo);

}
