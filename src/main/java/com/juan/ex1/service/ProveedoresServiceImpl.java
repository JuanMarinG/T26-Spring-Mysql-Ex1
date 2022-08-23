package com.juan.ex1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juan.ex1.dao.IProveedoresDAO;
import com.juan.ex1.dto.Proveedores;

@Service
public class ProveedoresServiceImpl implements IProveedoresService {

	@Autowired IProveedoresDAO iproveedoresDAO;
	
	@Override
	public List<Proveedores> listaProveedores() {
		// TODO Auto-generated method stub
		return iproveedoresDAO.findAll();
	}

	@Override
	public Proveedores guardarPiezas(Proveedores proveedores) {
		// TODO Auto-generated method stub
		return iproveedoresDAO.save(proveedores);
	}

	@Override
	public Proveedores proveedoresPorId(int id) {
		// TODO Auto-generated method stub
		return iproveedoresDAO.findById(id).get();
	}

	@Override
	public Proveedores actualizarProveedores(Proveedores proveedores) {
		// TODO Auto-generated method stub
		return iproveedoresDAO.save(proveedores);
	}

	@Override
	public void eliminarProveedores(int id) {
		// TODO Auto-generated method stub
		iproveedoresDAO.deleteById(id);
		
	}

}
