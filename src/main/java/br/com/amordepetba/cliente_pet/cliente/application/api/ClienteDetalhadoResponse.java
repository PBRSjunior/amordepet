package br.com.amordepetba.cliente_pet.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.amordepetba.cliente_pet.cliente.domain.Cliente;
import br.com.amordepetba.cliente_pet.cliente.domain.Sexo;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String cpf;
	private String email;
	private String celular;
	private Sexo sexo;
	private Boolean aceitaTermos;
	private LocalDateTime dataHoraDoCadastro;

	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.cpf = cliente.getCpf();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.sexo = cliente.getSexo();
		this.aceitaTermos = cliente.getAceitaTermos();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
	}

}
