package com.djimenez.menuInteractivo.controlador.impl;

import java.util.List;
import com.djimenez.menuInteractivo.controlador.CategoriaControlador;
import com.djimenez.menuInteractivo.modelo.dao.CategoriaDao;
import com.djimenez.menuInteractivo.modelo.dao.impl.CategoriaDaoImpl;
import com.djimenez.menuInteractivo.modelo.entidad.Categoria;

public class CategoriaControladorImpl implements CategoriaControlador {

	private CategoriaDao categoriaDao;

	@Override
	public void insertarCategoria(Categoria nuevoCategoria) {
		categoriaDao = new CategoriaDaoImpl();
		categoriaDao.insertarCategoria(nuevoCategoria);
	}

	@Override
	public void actualizarCategoria(Categoria actualizarCategoria) {
		categoriaDao = new CategoriaDaoImpl();
		categoriaDao.actualizarCategoria(actualizarCategoria);
	}

	@Override
	public void eliminarCategoria(Categoria eliminarCategoria) {
		categoriaDao = new CategoriaDaoImpl();
		categoriaDao.eliminarCategoria(eliminarCategoria);
	}

	@Override
	public List<Categoria> listarCategoria() {
		categoriaDao = new CategoriaDaoImpl();
		return categoriaDao.listarCategoria();
	}

}
