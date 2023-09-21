package com.exampleLuana.Luanaa.Servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampleLuana.Luanaa.Repositories.ClienteRepository;
import com.exampleLuana.Luanaa.entities.Clientes;

@Service
public class ClienteServicie {
	private final ClienteRepository clienteRepository;
	
	@Autowired
	public ClienteServicie (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Clientes saveCliente(Clientes cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Clientes> getAllClientes(){
		return clienteRepository.findAll();
	}
	
	public Clientes getProdutoById(Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);	
	}
	public void deleteCliente(Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}

	public Clientes getClienteById(Long idcCliente) {
		return null;
	}
	}
