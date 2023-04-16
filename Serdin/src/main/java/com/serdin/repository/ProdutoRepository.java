package com.serdin.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serdin.model.Produto;


@Repository //Interface responsável pela comunicação direta com o banco de dados. Aqui preciso informa qual a model e id.
public interface ProdutoRepository extends JpaRepository <Produto, Long> {
	
}
