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

import com.juan.ex1.dto.Piezas;
import com.juan.ex1.service.PiezasServiceImpl;

@RestController
@RequestMapping("/api")
public class PiezasController {

	@Autowired PiezasServiceImpl piezasServiceImpl;
	
	@GetMapping("/piezas")
	public List<Piezas> listaPiezas() {
		return piezasServiceImpl.listaPiezas();
	}
	@PostMapping("/piezas")
	public Piezas guardarPiezas(Piezas piezas) {
		return piezasServiceImpl.guardarPiezas(piezas);
	}
	@GetMapping("/piezas/{id}")
	public Piezas piezasPorId(@PathVariable(name="id_pieza")int id) {
		Piezas piezasPorId = new Piezas();
		piezasPorId = piezasServiceImpl.piezasPorId(id);
		return piezasPorId;
	}
	@PutMapping("/piezas/{id}")
	public Piezas actualizarPiezas(@PathVariable(name="id_pieza")int id, @RequestBody Piezas piezas) {
		Piezas pieza_seleccionada = new Piezas();
		Piezas pieza_actualizada = new Piezas();
		
		pieza_seleccionada = piezasServiceImpl.piezasPorId(id);
		pieza_seleccionada.setIdPieza(piezas.getIdPieza());
		pieza_actualizada = piezasServiceImpl.actualizarPiezas(pieza_seleccionada);
		return pieza_actualizada;
	}
	
	@DeleteMapping("/piezas/{id}")
	public void eliminarPiezas(int id) {
		piezasServiceImpl.eliminarPiezas(id);
	}
	
	
	
}
