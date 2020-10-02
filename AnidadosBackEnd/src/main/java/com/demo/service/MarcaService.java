package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Marca;
import com.demo.repository.MarcaRepository;

@Service
public class MarcaService {

	@Autowired
	MarcaRepository marcaRepository;
	
	public List<Marca> getMarcas(){
		return marcaRepository.findAll();
	}
}
