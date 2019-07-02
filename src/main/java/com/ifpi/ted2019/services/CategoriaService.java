package com.ifpi.ted2019.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpi.ted2019.domain.Categoria;
import com.ifpi.ted2019.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repository;
	
	public Categoria Buscar(Integer Id) {
		Optional<Categoria> object = repository.findById(Id);
		return object.orElse(null);
		
	}

}
