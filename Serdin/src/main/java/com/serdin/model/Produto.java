package com.serdin.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity //Entidade do Banco
@Table(name = "tb_produtos") //Configura tabela 
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O mome é obrigatório")
	@Size(min = 3, max = 50, message = "O nome deve comter no mínimo 3 e no máximo 50 caracteres.")
	private String nome;
	
	@NotBlank(message = "O preço é obrigatório")
	private BigDecimal preco;
	
	private String tamanho;
	
	private int quantidade;

}
