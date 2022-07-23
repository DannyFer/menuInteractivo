package com.djimenez.menuInteractivo.controlador;

import java.util.List;

import com.djimenez.menuInteractivo.modelo.entidad.Pedido;

public interface PedidoControlador {

	public void insertarPedido(Pedido nuevoPedido);

	public void actualizarPedido(Pedido actualizarPedido);

	public void eliminarPedido(Pedido eliminarPedido);
	
	public Pedido pedidoById(Integer idPedido);

	public List<Pedido> listarPedido();

}
