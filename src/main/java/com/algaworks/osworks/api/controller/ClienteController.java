package com.algaworks.osworks.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> Listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1l);
		cliente1.setNome("Heitor");
		cliente1.setTelefone("34 99999-1111");
		cliente1.setEmail("heitorpreviero@gmail.com");
		
		var cliente2 = new Cliente();
		cliente2.setId(2l);
		cliente2.setNome("Giulia");
		cliente2.setTelefone("34 77777-1111");
		cliente2.setEmail("giuliasavignano@gmail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}

}
