package com.algaworks.osworks.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.osworks.domain.model.Cliente;

public interface ClienteRepository  extends JpaRepository<Cliente, Long>{
	
	Cliente findByEmail(String email);

}
