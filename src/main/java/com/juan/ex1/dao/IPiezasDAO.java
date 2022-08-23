package com.juan.ex1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juan.ex1.dto.Piezas;

public interface IPiezasDAO extends JpaRepository <Piezas, Integer>{

}
