package com.serdin.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.serdin.model.Produto;
import com.serdin.repository.ProdutoRepository;

@Service //Camada responsável por toda regra de negócio e tratativa de dados,
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	public Produto salvar(Produto produto) {
		Produto produtoRetorno = produtoRepository.save(produto);
		return produtoRetorno;
	}

}
