package com.djimenez.menuInteractivo.controlador.impl;

import java.util.List;

import com.djimenez.menuInteractivo.controlador.PlatilloControlador;
import com.djimenez.menuInteractivo.modelo.dao.PlatilloDao;
import com.djimenez.menuInteractivo.modelo.dao.impl.PlatilloDaoImpl;
import com.djimenez.menuInteractivo.modelo.entidad.Platillo;

public class PlatilloControladorImpl implements PlatilloControlador {

	private PlatilloDao platilloDao;

	@Override
	public void insertarPlatillo(Platillo nuevoPlatillo) {
		platilloDao = new PlatilloDaoImpl();
		platilloDao.insertarPlatillo(nuevoPlatillo);

	}

	@Override
	public void actualizarPlatillo(Platillo actualizarPlatillo) {
		platilloDao = new PlatilloDaoImpl();
		platilloDao.actualizarPlatillo(actualizarPlatillo);

	}

	@Override
	public void eliminarPlatillo(Platillo eliminarPlatillo) {
		platilloDao = new PlatilloDaoImpl();
		platilloDao.eliminarPlatillo(eliminarPlatillo);

	}

	@Override
	public List<Platillo> listarPlatillo() {
		platilloDao = new PlatilloDaoImpl();
		return platilloDao.listarPlatillo();
	}

}
