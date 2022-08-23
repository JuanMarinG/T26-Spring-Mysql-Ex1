package com.juan.ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.ex1.dto.Proveedores;

public interface IProveedoresDAO extends JpaRepository<Proveedores, Integer>{

}
