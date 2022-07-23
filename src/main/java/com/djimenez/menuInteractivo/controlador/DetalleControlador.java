package com.djimenez.menuInteractivo.controlador;

import java.util.List;
import com.djimenez.menuInteractivo.modelo.entidad.Detalle;

public interface DetalleControlador {

	public void insertarDetalle(Detalle nuevoDetalle);

	public void actualizarDetalle(Detalle actualizarDetalle);

	public void eliminarDetalle(Detalle eliminarDetalle);

	public List<Detalle> listarDetalle();
	
	public List<Detalle> listarDetalleByPedido(Integer idPedido);

}
