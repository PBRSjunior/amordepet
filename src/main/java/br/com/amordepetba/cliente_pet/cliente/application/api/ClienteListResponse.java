package br.com.amordepetba.cliente_pet.cliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.amordepetba.cliente_pet.cliente.domain.Cliente;

public class ClienteListResponse {

	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return null;
	}
}
