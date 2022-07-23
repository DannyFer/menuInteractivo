package com.djimenez.menuInteractivo.modelo.dao;

import java.util.List;

import com.djimenez.menuInteractivo.modelo.entidad.Motorista;

public interface MotoristaDao {

	public void insertarMotorista(Motorista nuevoMotorista);

	public void actualizarMotorista(Motorista actualizarMotorista);

	public void eliminarMotorista(Motorista eliminarMotorista);

	public List<Motorista> listarMotorista();
}
