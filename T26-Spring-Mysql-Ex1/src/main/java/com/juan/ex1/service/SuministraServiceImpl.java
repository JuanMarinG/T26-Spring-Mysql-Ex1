package com.juan.ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex1.dao.ISuministraDAO;
import com.juan.ex1.dto.Suministra;

@Service
public class SuministraServiceImpl implements ISuministraService{

	@Autowired ISuministraDAO isuministraDAO;

	@Override
	public List<Suministra> listaSuministra() {
		// TODO Auto-generated method stub
		return isuministraDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return isuministraDAO.save(suministra);
	}

	@Override
	public Suministra suministraPorId(int id) {
		// TODO Auto-generated method stub
		return isuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return isuministraDAO.save(suministra);
	}

	@Override
	public void eliminarSuministra(int id) {
		// TODO Auto-generated method stub
		isuministraDAO.deleteById(id);
	}
	
}
