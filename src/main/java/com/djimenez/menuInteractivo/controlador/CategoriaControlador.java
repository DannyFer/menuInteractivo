package com.djimenez.menuInteractivo.controlador;

import java.util.List;

import com.djimenez.menuInteractivo.modelo.entidad.Categoria;

public interface CategoriaControlador {

	public void insertarCategoria(Categoria nuevoCategoria);

	public void actualizarCategoria(Categoria actualizarCategoria);

	public void eliminarCategoria(Categoria eliminarCategoria);

	public List<Categoria> listarCategoria();

}
