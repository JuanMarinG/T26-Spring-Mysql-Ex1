package com.juan.ex1.service;

import java.util.List;

import com.juan.ex1.dto.Suministra;

public interface ISuministraService {

	//ALL
		public List<Suministra> listaSuministra();
		//CREATE
		public Suministra guardarSuministra (Suministra suministra);
		//READ
		public Suministra suministraPorId(int id);
		//UPDATE
		public Suministra actualizarSuministra(Suministra suministra);
		//DELETE
		public void eliminarSuministra(int id);
}
