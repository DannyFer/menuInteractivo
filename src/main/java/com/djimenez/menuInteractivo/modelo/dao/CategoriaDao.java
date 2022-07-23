package com.djimenez.menuInteractivo.modelo.dao;

import java.util.List;

import com.djimenez.menuInteractivo.modelo.entidad.Categoria;

public interface CategoriaDao {

	public void insertarCategoria(Categoria nuevoCategoria);

	public void actualizarCategoria(Categoria actualizarCategoria);

	public void eliminarCategoria(Categoria eliminarCategoria);

	public List<Categoria> listarCategoria();
}
