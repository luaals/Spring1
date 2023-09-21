package com.exampleLuana.Luanaa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Clientes")
public class Clientes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;
	
	@Column(name = "nCliente")
	private String nCliente;
	
	@Column(name= "fone")
	private String fone;
	
	public Clientes() {
		
	}
	
	public Clientes(Long id, String nCliente, String fone) {
		this.idcCliente = id;
		this.nCliente = nCliente;
		this.fone = fone;
	}
	
	public Long getIdcCliente() {
		return idcCliente;
	}
	
	public void setIdcCliente(Long id) {
		this.idcCliente = id;
	}
	
	public String getnCliente() {
		return nCliente;
	}
	
	public String getfone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
}
