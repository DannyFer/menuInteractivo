package com.djimenez.menuInteractivo.controlador;

import java.util.List;
import com.djimenez.menuInteractivo.modelo.entidad.Combo;

public interface ComboControlador {

	public void insertarCombo(Combo nuevoCombo);

	public void actualizarCombo(Combo actualizarCombo);

	public void eliminarCombo(Combo eliminarCombo);

	public List<Combo> listarCombo();

}
