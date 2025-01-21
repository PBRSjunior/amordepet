package br.com.amordepetba.cliente_pet.pet.application.api;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import br.com.amordepetba.cliente_pet.pet.domain.Pet;
import br.com.amordepetba.cliente_pet.pet.domain.TipoPet;
import lombok.Value;

@Value
public class PetClienteListResponse {
	private UUID idPet;
	private UUID idClienteTutor;
	private String nomePet;
	private TipoPet tipo;
	private String raca;
	private String pelagemcor;
	private LocalDate dataNascimento;

	public static List<PetClienteListResponse> converte(List<Pet> petsDoCliente) {
		return petsDoCliente.stream()
				.map(PetClienteListResponse::new)
				.collect(Collectors.toList());
	}

	public PetClienteListResponse(Pet pet) {
		super();
		this.idPet = pet.getIdPet();
		this.idClienteTutor = pet.getIdClienteTutor();
		this.nomePet = pet.getNomePet();
		this.tipo = pet.getTipo();
		this.raca = pet.getRaca();
		this.pelagemcor = pet.getPelagemcor();
		this.dataNascimento = pet.getDataNascimento();
	}

}
