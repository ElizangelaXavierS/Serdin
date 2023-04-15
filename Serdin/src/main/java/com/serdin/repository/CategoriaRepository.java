package com.serdin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.serdin.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long>{

}
