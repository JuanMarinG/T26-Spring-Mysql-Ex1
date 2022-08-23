package com.juan.ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex1.dao.IPiezasDAO;
import com.juan.ex1.dto.Piezas;

@Service
public class PiezasServiceImpl implements IPiezasService{

	
	@Autowired IPiezasDAO ipiezasDAO;

	@Override
	public List<Piezas> listaPiezas() {
		// TODO Auto-generated method stub
		return ipiezasDAO.findAll();
	}

	@Override
	public Piezas guardarPiezas(Piezas piezas) {
		// TODO Auto-generated method stub
		return ipiezasDAO.save(piezas);
	}

	@Override
	public Piezas piezasPorId(int id) {
		// TODO Auto-generated method stub
		return ipiezasDAO.findById(id).get();
	}

	@Override
	public Piezas actualizarPiezas(Piezas piezas) {
		// TODO Auto-generated method stub
		return ipiezasDAO.save(piezas);
	}

	@Override
	public void eliminarPiezas(int id) {
		ipiezasDAO.deleteById(id);
		// TODO Auto-generated method stub
		
	}
	
}
