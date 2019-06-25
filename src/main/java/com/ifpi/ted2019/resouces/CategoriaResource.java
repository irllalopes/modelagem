package com.ifpi.ted2019.resouces;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifpi.ted2019.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")

public class CategoriaResource {
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar(){
		List<Categoria> categorias = new ArrayList<Categoria>();
		categorias.add(new Categoria(1,"Informática"));
		categorias.add(new Categoria(2,"Escritorio"));
		return categorias;
		
	}
	
		public String Listar() {
			return "Rest funcionando";
			
		}


}
