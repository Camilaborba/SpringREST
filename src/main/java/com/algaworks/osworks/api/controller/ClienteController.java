package com.algaworks.osworks.api.controller;


import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.osworks.domain.model.Cliente;



@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public  List<Cliente> listar() {
		var cliente1 = new Cliente();
		
		return Arrays.asList(cliente1);
	}

}
