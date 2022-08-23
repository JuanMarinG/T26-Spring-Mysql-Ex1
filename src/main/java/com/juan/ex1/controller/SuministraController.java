package com.juan.ex1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.juan.ex1.dto.Suministra;
import com.juan.ex1.service.SuministraServiceImpl;


@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired SuministraServiceImpl suministraServiceImpl;
	
	@GetMapping("/suministra")
	public List<Suministra> listaSuministra() {
		return suministraServiceImpl.listaSuministra();
	}
	@PostMapping("/suministra")
	public Suministra guardarSuministra(Suministra suministra) {
		return suministraServiceImpl.guardarSuministra(suministra);
	}
	@GetMapping("/suministra/{id}")
	public Suministra suministraPorId(@PathVariable(name="id_sum")int id) {
		Suministra suministraPorId = new Suministra();
		suministraPorId = suministraServiceImpl.suministraPorId(id);
		return suministraPorId;
	}
	@PutMapping("/suministra/{id}")
	public Suministra actualizarSuministra(@PathVariable(name="id_sum") int id, @RequestBody Suministra suministra) {
		Suministra suministra_seleccionado = new Suministra();
		suministra_seleccionado.setIdCodPieza(suministra.getIdCodPieza());
		suministra_seleccionado.setIdCodProv(suministra.getIdCodProv());
		suministra_seleccionado.setPrecio(suministra.getPrecio());
		return suministraServiceImpl.actualizarSuministra(suministra);
	}
	public void eliminarSuministra(int id) {
		suministraServiceImpl.eliminarSuministra(id);
	}
	
	
}
