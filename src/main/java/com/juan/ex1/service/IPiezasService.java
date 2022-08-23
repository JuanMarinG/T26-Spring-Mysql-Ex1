package com.juan.ex1.service;

import java.util.List;

import com.juan.ex1.dto.Piezas;

public interface IPiezasService {

	//ALL
	public List<Piezas> listaPiezas();
	//CREATE
	public Piezas guardarPiezas (Piezas piezas);
	//READ
	public Piezas piezasPorId(int id);
	//UPDATE
	public Piezas actualizarPiezas(Piezas piezas);
	//DELETE
	public void eliminarPiezas (int id);
}
