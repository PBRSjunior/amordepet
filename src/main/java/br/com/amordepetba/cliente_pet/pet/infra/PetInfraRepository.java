package br.com.amordepetba.cliente_pet.pet.infra;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import br.com.amordepetba.cliente_pet.handler.APIException;
import br.com.amordepetba.cliente_pet.pet.application.service.PetRepository;
import br.com.amordepetba.cliente_pet.pet.domain.Pet;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
@Repository
@Log4j2
@RequiredArgsConstructor
public class PetInfraRepository implements PetRepository {
	private final PetSpringDataJPARepository petSpringDataJPARepository;

	@Override
	public Pet salvaPet(Pet pet) {
		log.info("[inicia]PetInfraRepository - salvaPet");
		petSpringDataJPARepository.save(pet);
		log.info("[finaliza]PetInfraRepository - salvaPet");
		return pet;
	}

	@Override
	public List<Pet> buscaPetsDoClienteComID(UUID idCliente) {
		log.info("[inicia]PetInfraRepository - buscaPetsDoClienteComID");
		var pets = petSpringDataJPARepository.findByIdClienteTutor(idCliente);
		log.info("[finaliza]PetInfraRepository - buscaPetsDoClienteComID");
		return pets;
	}

	@Override
	public Pet buscaPetPeloId(UUID idPet) {
		log.info("[inicia]PetInfraRepository - buscaPetbuscaPetPeloId");
		var pet = petSpringDataJPARepository.findById(idPet)
				.orElseThrow(() -> APIException.build(HttpStatus.NOT_FOUND, "Pet não encontrado para o idPet = " + idPet));
		log.info("[finaliza]PetInfraRepository - buscaPetbuscaPetPeloId");
		return pet;
	}

	@Override
	public void deletaPet(Pet pet) {
		log.info("[inicia]PetInfraRepository - buscaPetbuscaPetPeloId");
		petSpringDataJPARepository.delete(pet);
		log.info("[finaliza]PetInfraRepository - buscaPetbuscaPetPeloId");
	}

}
