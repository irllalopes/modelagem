package com.ifpi.ted2019.resouces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifpi.ted2019.domain.Categoria;
import com.ifpi.ted2019.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")

public class CategoriaResource {
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value = "{/id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id){
		Categoria Object = service.Buscar(id);
		return ResponseEntity.ok().body(Object);
	}


}
