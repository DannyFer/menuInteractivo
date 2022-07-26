package com.djimenez.menuInteractivo.modelo.dao;

import java.util.List;

import com.djimenez.menuInteractivo.modelo.entidad.Combo;

public interface ComboDao {

	public void insertarCombo(Combo nuevoCombo);

	public void actualizarCombo(Combo actualizarCombo);

	public void eliminarCombo(Combo eliminarCombo);

	public List<Combo> listarCombo();
}
