package br.com.amordepetba.cliente_pet.pet.application.api;

import java.time.LocalDate;
import java.util.UUID;

import br.com.amordepetba.cliente_pet.pet.domain.Porte;
import br.com.amordepetba.cliente_pet.pet.domain.SexoPet;
import br.com.amordepetba.cliente_pet.pet.domain.TipoPet;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Value;

@Value
public class PetClienteDetalhadeResponse {
	private UUID idPet;
	@Column(columnDefinition = "uuid", name = "idClienteTutor", nullable = false)
	private UUID idClienteTutor;
	private String nomePet;
	@Enumerated(EnumType.STRING)
	private Porte porte;
	@Enumerated(EnumType.STRING)
	private TipoPet tipo;
	private String microchip;
	private String raca;
	@Enumerated(EnumType.STRING)
	private SexoPet sexo;
	private String pelagemcor;
	private LocalDate dataNascimento;
	private String rga;
	private Integer peso;
}
