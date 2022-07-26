package com.djimenez.menuInteractivo.controlador.impl;

import java.util.List;
import com.djimenez.menuInteractivo.controlador.MotoristaControlador;
import com.djimenez.menuInteractivo.modelo.dao.MotoristaDao;
import com.djimenez.menuInteractivo.modelo.dao.impl.MotoristaDaoImpl;
import com.djimenez.menuInteractivo.modelo.entidad.Motorista;

public class MotoristaControladorImpl implements MotoristaControlador {

	private MotoristaDao motoristaDao;

	@Override
	public void insertarMotorista(Motorista nuevoMotorista) {
		motoristaDao = new MotoristaDaoImpl();
		motoristaDao.insertarMotorista(nuevoMotorista);
	}

	@Override
	public void actualizarMotorista(Motorista actualizarMotorista) {
		motoristaDao = new MotoristaDaoImpl();
		motoristaDao.actualizarMotorista(actualizarMotorista);
	}

	@Override
	public void eliminarMotorista(Motorista eliminarMotorista) {
		motoristaDao = new MotoristaDaoImpl();
		motoristaDao.eliminarMotorista(eliminarMotorista);
	}

	@Override
	public List<Motorista> listarMotorista() {
		motoristaDao = new MotoristaDaoImpl();
		return motoristaDao.listarMotorista();
	}

}
