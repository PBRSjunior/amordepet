package br.com.amordepetba.cliente_pet.pet.application.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import br.com.amordepetba.cliente_pet.cliente.application.service.ClienteService;
import br.com.amordepetba.cliente_pet.pet.application.api.PetRequest;
import br.com.amordepetba.cliente_pet.pet.application.api.PetResponse;
import br.com.amordepetba.cliente_pet.pet.domain.Pet;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Service
@Log4j2
@RequiredArgsConstructor
public class PetApplicationService implements PetService {
	private final ClienteService clienteService;
	private final PetRepository petRepository;
	@Override
	public PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[inicia]PetApplicationService - criaPet");
		clienteService.buscaClienteAtravesId(idCliente);
		Pet pet = petRepository.salvaPet(new Pet(idCliente, petRequest));
		log.info("[finaliza]nPetApplicationService - criaPet");
		return new PetResponse(pet.getIdPet());
	}

}
