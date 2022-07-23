package com.djimenez.menuInteractivo.controlador.impl;

import java.util.List;
import com.djimenez.menuInteractivo.controlador.EmpleadoControlador;
import com.djimenez.menuInteractivo.modelo.dao.EmpleadoDao;
import com.djimenez.menuInteractivo.modelo.dao.impl.EmpleadoDaoImpl;
import com.djimenez.menuInteractivo.modelo.entidad.Empleado;

public class EmpleadoControladorImpl implements EmpleadoControlador {

	private EmpleadoDao empleadoDao;

	@Override
	public void insertarEmpleado(Empleado nuevoEmpleado) {
		empleadoDao = new EmpleadoDaoImpl();
		empleadoDao.insertarEmpleado(nuevoEmpleado);
	}

	@Override
	public void actualizarEmpleado(Empleado actualizarEmpleado) {
		empleadoDao = new EmpleadoDaoImpl();
		empleadoDao.actualizarEmpleado(actualizarEmpleado);
	}

	@Override
	public void eliminarEmpleado(Empleado eliminarEmpleado) {
		empleadoDao = new EmpleadoDaoImpl();
		empleadoDao.eliminarEmpleado(eliminarEmpleado);
	}

	@Override
	public List<Empleado> listarEmpleado() {
		empleadoDao = new EmpleadoDaoImpl();
		return empleadoDao.listarEmpleado();
	}

	@Override
	public Empleado consultaEmpleado(String cedula, String contrasenia, String admin) {
		empleadoDao = new EmpleadoDaoImpl();
		return empleadoDao.consultaEmpleado(cedula, contrasenia, admin);
	}

	@Override
	public Empleado consultaEmpleado(String cedula, String contrasenia) {
		empleadoDao = new EmpleadoDaoImpl();
		return empleadoDao.consultaEmpleado(cedula, contrasenia);
	}

}
