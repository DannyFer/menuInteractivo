package com.djimenez.menuInteractivo.controlador.impl;

import com.djimenez.menuInteractivo.controlador.IvaControlador;
import com.djimenez.menuInteractivo.modelo.dao.IvaDao;
import com.djimenez.menuInteractivo.modelo.dao.impl.IvaDaoImpl;
import com.djimenez.menuInteractivo.modelo.entidad.Iva;

public class IvaControladorImpl implements IvaControlador {

	private IvaDao ivaDao;

	@Override
	public void insertarIva(Iva nuevoIva) {
		ivaDao = new IvaDaoImpl();
		ivaDao.insertarIva(nuevoIva);
	}

	@Override
	public void actualizarIva(Iva actualizarIva) {
		ivaDao = new IvaDaoImpl();
		ivaDao.actualizarIva(actualizarIva);
	}

	@Override
	public void eliminarIva(Iva eliminarIva) {
		ivaDao = new IvaDaoImpl();
		ivaDao.eliminarIva(eliminarIva);
	}

	@Override
	public Iva obtenerIva() {
		ivaDao = new IvaDaoImpl();
		return ivaDao.obtenerIva();
	}
}
