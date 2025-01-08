package br.com.amordepetba.cliente_pet.pet.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.amordepetba.cliente_pet.pet.application.api.PetRequest;
import br.com.amordepetba.cliente_pet.pet.application.api.PetResponse;
import jakarta.validation.Valid;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2

public class PetApplicationService implements PetService {

	@Override
	public PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[inicia]nPetApplicationService - criaPet");
		
		log.info("[finaliza]nPetApplicationService - criaPet");
		return null;
	}

}
