package com.serdin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serdin.model.Produto;

@Repository //Cominicar com o banco, preciso informa qual a model e id.
public interface ProdutoRepository extends JpaRepository <Produto, Long> {

}
