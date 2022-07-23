package com.djimenez.menuInteractivo.controlador;

import java.util.List;
import com.djimenez.menuInteractivo.modelo.entidad.Empleado;

public interface EmpleadoControlador {

	public void insertarEmpleado(Empleado nuevoEmpleado);

	public void actualizarEmpleado(Empleado actualizarEmpleado);

	public void eliminarEmpleado(Empleado eliminarEmpleado);

	public List<Empleado> listarEmpleado();
	
	public Empleado consultaEmpleado(String cedula, String contrasenia);

	public Empleado consultaEmpleado(String cedula, String contrasenia, String admin);

}
