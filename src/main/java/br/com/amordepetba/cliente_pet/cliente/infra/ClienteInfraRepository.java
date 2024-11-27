package br.com.amordepetba.cliente_pet.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.amordepetba.cliente_pet.cliente.application.repository.ClienteRepository;
import br.com.amordepetba.cliente_pet.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		cliente
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}

}
