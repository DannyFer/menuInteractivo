package com.djimenez.menuInteractivo.modelo.dao;

import java.util.List;

import com.djimenez.menuInteractivo.modelo.entidad.Ingrediente;

public interface IngredienteDao {

	public void insertarIngrediente(Ingrediente nuevoIngrediente);

	public void actualizarIngrediente(Ingrediente actualizarIngrediente);

	public void eliminarIngrediente(Ingrediente eliminarIngrediente);

	public List<Ingrediente> listarIngrediente();
	
}
