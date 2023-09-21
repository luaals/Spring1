package com.exampleLuana.Luanaa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exampleLuana.Luanaa.Servicies.ClienteServicie;
import com.exampleLuana.Luanaa.entities.Clientes;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	private final ClienteServicie clienteService;
	
	@Autowired
	public ClienteController (ClienteServicie clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	public Clientes createProduct(@RequestBody Clientes cliente) {
		return clienteService.saveCliente(cliente);
	}
	
	@GetMapping("/{idcCliente}")
	public Clientes getCliente(@PathVariable Long idcCliente) {
		return clienteService.getClienteById(idcCliente);
	}
	
	@GetMapping
	public List<Clientes> getAllClientes(){
		return clienteService.getAllClientes();
	}
	@DeleteMapping("/{idcCliente}")
	public void deleteCliente(@PathVariable Long idcCliente) {
		clienteService.deleteCliente(idcCliente);
	}
	
}
