package com.djimenez.menuInteractivo.modelo.dao;

import java.util.List;
import com.djimenez.menuInteractivo.modelo.entidad.Detalle;

public interface DetalleDao {

	public void insertarDetalle(Detalle nuevoDetalle);

	public void actualizarCliente(Detalle actualizarDetalle);

	public void eliminarCliente(Detalle eliminarDetalle);

	public List<Detalle> listarDetalle();
	
	public List<Detalle> listarDetalleByPedido(Integer idPedido);
}
