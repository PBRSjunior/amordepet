package br.com.amordepetba.cliente_pet.cliente.application.service;

import br.com.amordepetba.cliente_pet.cliente.application.api.ClienteRequest;
import br.com.amordepetba.cliente_pet.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);

}
