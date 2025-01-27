package br.com.amordepetba.cliente_pet.pet.application.service;

import java.util.List;
import java.util.UUID;

import br.com.amordepetba.cliente_pet.pet.domain.Pet;

public interface PetRepository {
	Pet salvaPet(Pet pet);
	List<Pet> buscaPetsDoClienteComID(UUID idCliente);
	Pet buscaPetPeloId(UUID idPet);
	void deletaPet(Pet pet);

}
