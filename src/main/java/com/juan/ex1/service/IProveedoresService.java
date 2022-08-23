package com.juan.ex1.service;

import java.util.List;

import com.juan.ex1.dto.Proveedores;

public interface IProveedoresService {

	//ALL
		public List<Proveedores> listaProveedores();
		//CREATE
		public Proveedores guardarPiezas (Proveedores proveedores);
		//READ
		public Proveedores proveedoresPorId(int id);
		//UPDATE
		public Proveedores actualizarProveedores(Proveedores proveedores);
		//DELETE
		public void eliminarProveedores (int id);
}
