package br.com.amordepetba.cliente_pet.cliente.application.repository;

import br.com.amordepetba.cliente_pet.cliente.domain.Cliente;

public interface ClienteRepository {
	Cliente salva(Cliente cliente);
}
