package com.juan.ex1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.ex1.dto.Proveedores;
import com.juan.ex1.service.ProveedoresServiceImpl;

@RestController
@RequestMapping("/api")
public class ProveedoresController {

	@Autowired ProveedoresServiceImpl proveedoresServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedores> listaProveedores() {
		return proveedoresServiceImpl.listaProveedores();
	}
	@PostMapping("/proveedores")
	public Proveedores guardarPiezas(Proveedores proveedores) {
		return proveedoresServiceImpl.guardarPiezas(proveedores);
	}
	@GetMapping("/proveedores/{id}")
	public Proveedores proveedoresPorId(@PathVariable(name="id_prov")int id) {
		Proveedores proveedoresPorId = new Proveedores();
		proveedoresPorId = proveedoresServiceImpl.proveedoresPorId(id);
		return proveedoresPorId;
	}
	@PutMapping("/proveedores/{id}")
	public Proveedores actualizarProveedores(@PathVariable(name="id_prov") int id, @RequestBody Proveedores proveedores) {
		Proveedores proveedor_seleccionado = new Proveedores();
		Proveedores proveedor_actualizado = new Proveedores ();
		
		
		proveedor_seleccionado = proveedoresServiceImpl.proveedoresPorId(id);
		proveedor_seleccionado.setIdProv(proveedores.getIdProv());
		proveedor_actualizado = proveedoresServiceImpl.actualizarProveedores(proveedor_seleccionado);
		return proveedor_actualizado;
	}
	@DeleteMapping("/proveedores/{id}")
	public void eliminarProveedores(int id) {
		proveedoresServiceImpl.eliminarProveedores(id);
	}
	
	
}
