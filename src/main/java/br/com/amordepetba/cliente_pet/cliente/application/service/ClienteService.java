package br.com.amordepetba.cliente_pet.cliente.application.service;

import java.util.List;

import br.com.amordepetba.cliente_pet.cliente.application.api.ClienteListResponse;
import br.com.amordepetba.cliente_pet.cliente.application.api.ClienteRequest;
import br.com.amordepetba.cliente_pet.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();

}
