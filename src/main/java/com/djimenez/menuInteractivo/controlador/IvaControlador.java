package com.djimenez.menuInteractivo.controlador;

import com.djimenez.menuInteractivo.modelo.entidad.Iva;

public interface IvaControlador {

	public void insertarIva(Iva nuevoIva);

	public void actualizarIva(Iva actualizarIva);

	public void eliminarIva(Iva eliminarIva);
	
	public Iva obtenerIva();
}
