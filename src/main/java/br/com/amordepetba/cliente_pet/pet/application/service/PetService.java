package br.com.amordepetba.cliente_pet.pet.application.service;

import java.util.List;
import java.util.UUID;

import br.com.amordepetba.cliente_pet.pet.application.api.PetClienteDetalheResponse;
import br.com.amordepetba.cliente_pet.pet.application.api.PetClienteListResponse;
import br.com.amordepetba.cliente_pet.pet.application.api.PetRequest;
import br.com.amordepetba.cliente_pet.pet.application.api.PetResponse;
import jakarta.validation.Valid;

public interface PetService {
	PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);
	List<PetClienteListResponse> buscaPetsDoClienteComID(UUID idCliente);
	PetClienteDetalheResponse buscaPetsDoClienteComID(UUID idCliente, UUID idPet);
	
}
