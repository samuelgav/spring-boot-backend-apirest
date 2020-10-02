package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Marca;
import com.demo.service.MarcaService;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:4200")
public class MarcaController {

	@Autowired
	private MarcaService marcaService;
	
	@GetMapping("/marcas")
	public List<Marca> getMarcas(){
		return marcaService.getMarcas();
	}
}
