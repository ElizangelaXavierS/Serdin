package com.serdin.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.serdin.model.Produto;
import com.serdin.service.ProdutoService;

@RestController //Camada responsável por manipular todas as requisições feitas do lado de fora da nossa API.
@RequestMapping("/produtos")// Usada para mapear URLs em métodos de controle de um controlador em um aplicativo web baseado em Spring MVC
public class ProdutoController {
	
	@Autowired
	private ProdutoService produtoService;
	
	
	//@PostMapping
	//public ResponseEntity<Produto>  cadastra(@Valid @RequestBody Produto produto){
		
//	}

}
