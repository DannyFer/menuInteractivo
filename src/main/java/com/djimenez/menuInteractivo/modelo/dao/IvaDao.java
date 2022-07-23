package com.djimenez.menuInteractivo.modelo.dao;

import com.djimenez.menuInteractivo.modelo.entidad.Iva;

public interface IvaDao {

	public void insertarIva(Iva nuevoIva);

	public void actualizarIva(Iva actualizarIva);

	public void eliminarIva(Iva eliminarIva);
	
	public Iva obtenerIva();
}
