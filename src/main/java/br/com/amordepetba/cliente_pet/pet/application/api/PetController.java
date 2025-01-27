package br.com.amordepetba.cliente_pet.pet.application.api;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.amordepetba.cliente_pet.pet.application.service.PetService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class PetController implements PetAPI {
	private final PetService petService;

	@Override
	public PetResponse postPet(UUID idCliente, @Valid PetRequest petRequest) {
		log.info("[inicia] PetController - postPet");
		log.info("[idCliente] {}", idCliente);
		PetResponse pet = petService.criaPet(idCliente, petRequest);
		log.info("[finaliza] PetController - postPet");
		return pet;
	}

	@Override
	public List<PetClienteListResponse> getPetsDoClientesComId(UUID idCliente) {
		log.info("[inicia] PetController - getPetsDoClientesComId");
		log.info("[idCliente] {}", idCliente);
		List<PetClienteListResponse> petsDoCliente = petService.buscaPetsDoClienteComID(idCliente);
		log.info("[finaliza] PetController - getPetsDoClientesComId");
		return petsDoCliente;
	}

	@Override
	public PetClienteDetalheResponse getClienteAtravesId(UUID idCliente, UUID idPet) {
		log.info("[inicia] PetController - getPetsDoClientesComId");
		log.info("[idCliente] {} - [idPet] {}", idCliente, idPet);
		PetClienteDetalheResponse pet = petService.buscaPetsDoClienteComID(idCliente, idPet);
		log.info("[finaliza] PetController - getPetsDoClientesComId");
		return pet;
	}

	@Override
	public void deletePetClienteComId(UUID idCliente, UUID idPet) {
		log.info("[inicia] PetController - deletePetClienteComIdd");
		log.info("[idCliente] {} - [idPet] {}", idCliente, idPet);
		petService.deletePetClienteComId(idCliente, idPet);
		log.info("[finaliza] PetController - deletePetClienteComId");

	}

}
