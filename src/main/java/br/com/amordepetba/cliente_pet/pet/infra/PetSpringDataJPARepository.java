package br.com.amordepetba.cliente_pet.pet.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.amordepetba.cliente_pet.pet.domain.Pet;

public interface PetSpringDataJPARepository extends JpaRepository<Pet,UUID> {

}
